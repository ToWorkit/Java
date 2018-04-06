package com.avgSalary.combiner;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AvgSalaryMapper extends Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	protected void map(LongWritable key1, Text value1, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// ����  -> 7654,MARTIN,SALESMAN,7698,1981/9/28,1250,1400,30
		String data = value1.toString();
		// �ִ�
		String[] words = data.split(",");
		
		// ���  k2: ����  v2: нˮ
		// ֻ��һ�� key ����ֵ��ϲ���һ�� key ��
		context.write(new Text("salary"), new IntWritable(Integer.parseInt(words[5])));
	}
	
}
