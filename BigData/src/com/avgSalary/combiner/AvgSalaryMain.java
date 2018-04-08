package com.avgSalary.combiner;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;

public class AvgSalaryMain {
	public static void main(String[] args) throws Exception {
		// 创建一个Job： job = map + reduce
		Job job = Job.getInstance(new Configuration());
		// 指定任务的入口
		job.setJarByClass(AvgSalaryMain.class);
		
		// 指定Mapper和输出的数据类型 k2 v2
		job.setMapperClass(AvgSalaryMapper.class);
		job.setMapOutputKeyClass(Text.class);    //指定k2
		job.setMapOutputValueClass(IntWritable.class);  //指定v2
		
		
		// 增加一个Combiner的class (合并，会在Mapper端提前做一次Reducer的操作以来提高效率)
		// 但有些事情是不可以用的，比如求平均数(合并的时候会出问题)
//		job.setCombinerClass(AvgSalaryReducer.class);
		
		// 指定Reducer和输出的数据类型
		job.setReducerClass(AvgSalaryReducer.class);
		job.setOutputKeyClass(Text.class);   //指定k4
		job.setOutputValueClass(DoubleWritable.class);   //指定v4
		
		// 指定输入的路径(map), 输出的路径(reduce)
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// 执行任务
		job.waitForCompletion(true);
	}
}
