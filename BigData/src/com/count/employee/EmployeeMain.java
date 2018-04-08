package com.count.employee;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class EmployeeMain {
	public static void main(String[] args) throws Exception {
		// ����һ��job��job = map + reduce
		Job job = Job.getInstance(new Configuration());
		
		// ָ����������
		job.setJarByClass(EmployeeMain.class);
		
		// ָ�������Mapper��������������� k2 v2
		job.setMapperClass(EmployeeMapper.class);
		job.setMapOutputKeyClass(IntWritable.class);
		// �Զ���Ķ���
		job.setMapOutputValueClass(Employee.class);
		
		// ָ�������·��(map), �����·��(reduce)
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// ִ������
		job.waitForCompletion(true);
	}
}
