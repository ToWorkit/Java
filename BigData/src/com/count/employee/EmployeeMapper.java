package com.count.employee;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class EmployeeMapper extends Mapper<LongWritable, Text, IntWritable, Employee> {

	@Override
	protected void map(LongWritable key1, Text value1, Mapper<LongWritable, Text, IntWritable, Employee>.Context context)
			throws IOException, InterruptedException {
		// ���� 7654,MARTIN,SALESMAN,7698,1981/9/28,1250,1400,30
		String data = value1.toString();
		
		// �ִ�
		String[] words = data.split(",");
		
		// ����Ա���Ķ���
		Employee e = new Employee();
		
		// ����Ա��������
		// Ա����
		e.setEmpno(Integer.parseInt(words[0]));
		// ����
		e.setEname(words[1]);
		// ְλ
		e.setJob(words[2]);
		// ����ţ���ЩԱ��û�о���
		try {
			e.setMgr(Integer.parseInt(words[3]));
		} catch (Exception ex) {
			// û���ϰ��
			e.setMgr(-1);
		}
		
		// ��ְ����
		e.setHiredate(words[4]);
		// нˮ
		e.setSal(Integer.parseInt(words[5]));
		// ������ЩԱ��û�н���
		try {
			e.setComm(Integer.parseInt(words[6]));
		} catch (Exception ex) {
			// û�н���
			e.setComm(0);
		}
		
		// ���ź�
		e.setDeptno(Integer.parseInt(words[7]));
		// ���Ա���ţ�Ա������
		context.write(new IntWritable(e.getEmpno()), e);
	}
	
}
