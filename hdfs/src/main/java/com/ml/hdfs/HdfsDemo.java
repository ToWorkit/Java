package com.ml.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HdfsDemo {
    /**
     * 获取hdfs客户端
     */
    @Test
    public void getClient() throws IOException {
        // 配置hdfs
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://bigdata111:9000");
        // 获取hdfs客户端
        FileSystem fileSystem = FileSystem.get(configuration);
        // 创建目录
        fileSystem.mkdirs(new Path("/9090"));
        // 关闭资源
        fileSystem.close();
        System.out.println("end");
    }

    @Test
    public void getClient_02() throws Exception {
        Configuration configuration = new Configuration();
        // 获取hdfs的客户端
        FileSystem fileSystem = FileSystem.get(
                new URI("hdfs://bigdata111:9000"),
                configuration,
                "ml");

        // 创建一个目录
        fileSystem.mkdirs(new Path("/9091"));

        fileSystem.close();
        System.out.println("end");
    }

    @Test
    public void putFile() throws Exception {
        // 获取hdfs客户端
        Configuration configuration = new Configuration();
        // 修改副本数，1. 在resource中创建xml修改，2. 通过configuration修改
        configuration.set("dfs.replication", "2");
        // 地址，配置文件，操作hdfs的用户名
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");
        // 上传文件
        fileSystem.copyFromLocalFile(new Path("D:/test.txt"), new Path("/9091/test.txt"));
        // 关闭连接
        fileSystem.close();
    }

    /**
     * 文件下载
     */
    @Test
    public void getFile() throws Exception {
        // 获取hdfs客户端
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");
        // 下载文件

/*      boolean delSrc,  是否删除源文件
        Path src,   源文件路径
        Path dst,   目标路径
        boolean useRawLocalFileSystem 是否使用本地的文件系统(是否开启文本校验)
        */
        fileSystem.copyToLocalFile(false, new Path("/9090/test.txt"), new Path("d:/test_01.txt"), false);

        // 关闭
        fileSystem.close();

        /*test_01.txt
        .test_01.txt.crc*/

    }

    /**
     * 文件删除
     */
    @Test
    public void fileDel() throws Exception {
        // 获取hdfs客户端
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");
        // 删除文件
        fileSystem.delete(new Path("/9090/test.txt"), false);
        // 关闭
        fileSystem.close();
    }

    /**
     * 文件名更改
     */
    @Test
    public void fileRename() throws Exception {
        // 获取hdfs的客户端
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");
        // 改名
        fileSystem.rename(new Path("/9091/test"), new Path("/9091/test_01.txt"));
        // 关闭
        fileSystem.close();
    }

    /**
     * 查询文件信息
     */
    @Test
    public void fileLS_01() throws Exception {
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");

        // Iterator 迭代器
        RemoteIterator<LocatedFileStatus> listFiles = fileSystem.listFiles(new Path("/"), true);

        while (listFiles.hasNext()) {
            LocatedFileStatus fileStatus = listFiles.next();
            // 文件大小
            System.out.println(fileStatus.getLen());
            // 文件路径
            System.out.println(fileStatus.getPath());
            // 文件名
            System.out.println(fileStatus.getPath().getName());
            // 权限
            System.out.println(fileStatus.getPermission());
            BlockLocation[] locations = fileStatus.getBlockLocations();
            for (BlockLocation location : locations) {
                String[] hosts = location.getHosts();
                for (String host : hosts) {
                    System.out.println(host);
                }
            }
            System.out.println("----------------------");
        }

        fileSystem.close();
    }

    /**
     * IO流上传文件
     */
    @Test
    public void fileIoPut() throws Exception {
        // 获取hdfs的客户端
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");
        // 创建输入流
        FileInputStream fis = new FileInputStream("d:/test.txt");
        // 创建输出流
        FSDataOutputStream fos = fileSystem.create(new Path("/9090/test_02.txt"));
        // 流的传输
        IOUtils.copyBytes(fis, fos, configuration);
        // 关闭资源
        fileSystem.close();
    }

    /**
     * IO流下载文件
     */
    @Test
    public void fileDown() throws Exception {
        // 获取hdfs客户端
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://bigdata111:9000"), configuration, "ml");
        // 获取输入流
        FSDataInputStream fis = fileSystem.open(new Path("/9090/test_02.txt"));
        // 获取输出流
        FileOutputStream fos = new FileOutputStream("d:/test_03.txt");
        // 流的传递
        IOUtils.copyBytes(fis, fos, configuration);
        // 关闭
        fileSystem.close();
    }
}
