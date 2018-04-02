package demo09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * java爬虫获取邮箱地址
 */

public class javaSpider01 {
	public static void main(String[] args) throws Exception {
		// 1. 网页地址
		URL url = new URL("http://bbs.tianya.cn/post-funinfo-3330777-1.shtml");
		// 2. 打开网页
		URLConnection urlc = url.openConnection();
		// 3. 处理超时问题
		urlc.setConnectTimeout(1000 * 10);
		// 4. 获取数据(整个网页)
		// 创建缓冲流，将输入转换流(读取数据并指定编码)作为匿名对象参数传入
		BufferedReader bufreader = new BufferedReader(new InputStreamReader(urlc.getInputStream(), "GBK"));
		// 5. 邮箱正则
		String reg = "[a-zA-Z1-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
		// 6. 编译正则
		Pattern p = Pattern.compile(reg);
		
		// 7. 处理数据
		String line = null;
		while((line = bufreader.readLine()) != null) {
			// 匹配邮箱
			Matcher m = p.matcher(line);
			while(m.find()) {
				// 截取打印
				System.out.println(m.group());
			}	
		}
	}
}
