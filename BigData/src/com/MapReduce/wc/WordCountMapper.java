package com.MapReduce.wc;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
// public class WordCountMapper extends Mapper<k1, v1, k2, v2> { ��������
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	protected void map(LongWritable key1, Text value1, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		/*
		 * context ����Mapper��������
		 * ���� -> HDFS
		 * ���� -> Reducer
		 */
		
		// ȡ������ -> I Love You
		String data = value1.toString();
		// �ִ�
		String[] words = data.split(" ");
		
		// ��� k2 v2
		for (String word:words) {
			// k2 -> ���ʣ�v2 -> ��һ����
			context.write(new Text(word), new IntWritable(1));
		}
	}
	
}
