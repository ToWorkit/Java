package demo09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Map���ϵĵڶ��ֵ���,���ݼ�ֵ�Զ���,��ȡ����ֵ
 *  A:��ֵ�Զ����Ҽ���ֵ˼·��
	* ��ȡ���м�ֵ�Զ���ļ���
	* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
	* ���ݼ�ֵ�Զ����Ҽ���ֵ
 */
// Map.Entry ˵��Entry��Map���ڲ��ӿ�,������ֵ��װ����Entry����,���洢��Set������

public class map03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		for(Entry<String, Integer> en: map.entrySet()) {
			System.out.println(en.getKey() + "->" + en.getValue());
		}
	}

}
