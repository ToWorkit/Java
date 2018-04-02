package com.apache.salary;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;

public class SalaryTotalMain {
	public static void main(String[] args) throws Exception {
		// 创建一个任务
		Job job = Job.getInstance(new Configuration());
		// 任务的入口
		job.setJarByClass(SalaryTotalMain.class);
		
		// 任务的Mapper和输出
		job.setMapperClass(SalaryTotalMapper.class);
		job.setMapOutputKeyClass(IntWritable.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		// 任务的Reducer和输出
		job.setReducerClass(SalaryTotalReducer.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 指定任务的输入和输出
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// 执行任务
		job.waitForCompletion(true);
	}
}
