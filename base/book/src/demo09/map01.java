package demo09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * * A:Map���ϵĹ��ܸ���
	* a:��ӹ���
		* V put(K key,V value):���Ԫ�ء�
			* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
			* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	* b:ɾ������
		* void clear():�Ƴ����еļ�ֵ��Ԫ��
		* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
	* c:�жϹ���
		* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		* boolean isEmpty()���жϼ����Ƿ�Ϊ��
	* d:��ȡ����
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):���ݼ���ȡֵ
		* Set<K> keySet():��ȡ���������м��ļ���
		* Collection<V> values():��ȡ����������ֵ�ļ���
	* e:���ȹ���
		* int size()�����ؼ����еļ�ֵ�Եĸ���
 */

public class map01 {

	public static void main(String[] args) {
		//  key      value
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// ��ȡ�����е�����ֵ
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());
//		demo01();
		demo02();
	}
	
	
	public static void demo02() {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// ���ݼ�ɾ��Ԫ�أ����ؼ���Ӧ��ֵ
		Integer value = map.remove("c");
		System.out.println(value);
		
		// �ж��Ƿ��������ļ�
		System.out.println(map.containsKey("d"));
		// �ж��Ƿ���������ֵ
		System.out.println(map.containsValue(4));
		System.out.println(map);
	}
	
	public static void demo01() {
		Map<String, Integer> map = new HashMap<>();
		Integer i1 = map.put("a", 23);
		Integer i2 = map.put("b", 22);
		Integer i3 = map.put("b", 24);
		Integer i4 = map.put("c", 21);
		Integer i5 = map.put("d", 20);
		Integer i6 = map.put("e", 22);
		System.out.println(map);
		System.out.println(i3);
	}

}
