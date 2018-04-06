package com.avgSalary.combiner;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;

public class AvgSalaryMain {
	public static void main(String[] args) throws Exception {
		// ����һ��Job�� job = map + reduce
		Job job = Job.getInstance(new Configuration());
		// ָ����������
		job.setJarByClass(AvgSalaryMain.class);
		
		// ָ��Mapper��������������� k2 v2
		job.setMapperClass(AvgSalaryMapper.class);
		job.setMapOutputKeyClass(Text.class);    //ָ��k2
		job.setMapOutputValueClass(IntWritable.class);  //ָ��v2
		
		
		// ����һ��Combiner��class (�ϲ�������Mapper����ǰ��һ��Reducer�Ĳ����������Ч��)
		// ����Щ�����ǲ������õģ�������ƽ����(�ϲ���ʱ��������)
//		job.setCombinerClass(AvgSalaryReducer.class);
		
		// ָ��Reducer���������������
		job.setReducerClass(AvgSalaryReducer.class);
		job.setOutputKeyClass(Text.class);   //ָ��k4
		job.setOutputValueClass(DoubleWritable.class);   //ָ��v4
		
		// ָ�������·��(map), �����·��(reduce)
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// ִ������
		job.waitForCompletion(true);
	}
}
