package com.MapReduce.wc;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
//public class WordCountReducer extends Reducer<k3, v3, k4, v4> { 数据类型
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

	@Override
	protected void reduce(Text k3, Iterable<IntWritable> v3,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		/*
		 * context 代表的reduce的上下文
		 * 上文 -> Mapper
		 * 下文 -> HDFS
		 */
		// 对 v3 进行求和(接收的Mapper输入的参数)
		int total = 0;
		for (IntWritable v: v3) {
			total += v.get();
		}
		
		// 输出 -> k4 单词， v4 频率
		context.write(k3, new IntWritable(total));
	}
	
}
