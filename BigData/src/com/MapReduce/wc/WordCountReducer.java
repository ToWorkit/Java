package com.MapReduce.wc;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
//public class WordCountReducer extends Reducer<k3, v3, k4, v4> { ��������
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

	@Override
	protected void reduce(Text k3, Iterable<IntWritable> v3,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		/*
		 * context �����reduce��������
		 * ���� -> Mapper
		 * ���� -> HDFS
		 */
		// �� v3 �������(���յ�Mapper����Ĳ���)
		int total = 0;
		for (IntWritable v: v3) {
			total += v.get();
		}
		
		// ��� -> k4 ���ʣ� v4 Ƶ��
		context.write(k3, new IntWritable(total));
	}
	
}
