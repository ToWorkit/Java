package com.apache.salary;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;

public class SalaryTotalMain {
	public static void main(String[] args) throws Exception {
		// ����һ������
		Job job = Job.getInstance(new Configuration());
		// ��������
		job.setJarByClass(SalaryTotalMain.class);
		
		// �����Mapper�����
		job.setMapperClass(SalaryTotalMapper.class);
		job.setMapOutputKeyClass(IntWritable.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		// �����Reducer�����
		job.setReducerClass(SalaryTotalReducer.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(IntWritable.class);
		
		// ָ���������������
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// ִ������
		job.waitForCompletion(true);
	}
}
