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
		// 数据  -> 7654,MARTIN,SALESMAN,7698,1981/9/28,1250,1400,30
		String data = value1.toString();
		// 分词
		String[] words = data.split(",");
		
		// 输出  k2: 常量  v2: 薪水
		// 只有一个 key 所有值会合并到一个 key 上
		context.write(new Text("salary"), new IntWritable(Integer.parseInt(words[5])));
	}
	
}
