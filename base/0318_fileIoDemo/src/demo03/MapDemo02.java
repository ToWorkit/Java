package demo03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map ���ϵı���
 * 	���ü���ȡֵ
 * 	Map�ӿ��ж����˷���keySet
 * 		����ȡ��ֵ�洢�� Set �������ٽ��б���
 * Map�����ǲ�����ֱ�ӱ�����
 */

public class MapDemo02 {
	public static void main(String[] args) {
		Map<Integer, String> _map = new HashMap<Integer, String>();
		_map.put(0, "a");
		_map.put(1, "b");
		_map.put(2, "c");
		_map.put(3, "d");
		_map.put(4, "e");
		// 1. ����Map��keySet������key�洢��Set������
		Set<Integer> key = _map.keySet();
		// 2.����Set�����е�ֵ(key)��Map�ٸ���ֵ(key)��ȡ���Ӧ��ֵ
		Iterator<Integer> it = key.iterator();
		
		for(Integer map_key: key) {
			String map_value = _map.get(map_key);
			System.out.println(map_key + "=" + map_value);
		}
		
		System.out.println("-------------------");
		
		while(it.hasNext()) {
			Integer map_key = it.next();
			String map_value =  _map.get(map_key);
			System.out.println(map_key + "=" + map_value);
		}
	}
}
