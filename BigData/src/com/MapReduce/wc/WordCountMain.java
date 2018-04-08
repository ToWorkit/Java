package com.MapReduce.wc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCountMain {
	public static void main(String[] args) throws Exception {
		// ����һ��job => job = map + reduce
		Job job = Job.getInstance(new Configuration());
		
		// ָ����������
		job.setJarByClass(WordCountMain.class);
		
		// ָ�������Mapper��������������� k2 v2
		job.setMapperClass(WordCountMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		// ָ�������Reducer��������������� k4 v4
		job.setReducerClass(WordCountReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// ָ�������·��(map), �����·��(reduce), �Բ�������ʽ����
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// ִ������ ����ֵ���Ƿ��ӡ��־
		job.waitForCompletion(true);
	}
}
