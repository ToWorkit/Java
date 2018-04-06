package com.avgSalary.combiner;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// v4 -> 平均值会出现小数点
public class AvgSalaryReducer extends Reducer<Text, IntWritable, Text, DoubleWritable>{

	@Override
	protected void reduce(Text k3, Iterable<IntWritable> v3,
			Reducer<Text, IntWritable, Text, DoubleWritable>.Context context) throws IOException, InterruptedException {
		int total = 0;
		int count = 0;
		
		for (IntWritable sal: v3) {
			// 通过 get() 获取值
			total += sal.get();
			count ++;
		}
		
		// 输出
		context.write(new Text("Avg Salary is: "), new DoubleWritable(total/count));
	}
	
}
