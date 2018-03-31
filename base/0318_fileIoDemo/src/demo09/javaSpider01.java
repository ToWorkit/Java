package demo09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * java�����ȡ�����ַ
 */

public class javaSpider01 {
	public static void main(String[] args) throws Exception {
		// 1. ��ҳ��ַ
		URL url = new URL("http://bbs.tianya.cn/post-funinfo-3330777-1.shtml");
		// 2. ����ҳ
		URLConnection urlc = url.openConnection();
		// 3. ����ʱ����
		urlc.setConnectTimeout(1000 * 10);
		// 4. ��ȡ����(������ҳ)
		// ������������������ת����(��ȡ���ݲ�ָ������)��Ϊ���������������
		BufferedReader bufreader = new BufferedReader(new InputStreamReader(urlc.getInputStream(), "GBK"));
		// 5. ��������
		String reg = "[a-zA-Z1-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
		// 6. ��������
		Pattern p = Pattern.compile(reg);
		
		// 7. ��������
		String line = null;
		while((line = bufreader.readLine()) != null) {
			// ƥ������
			Matcher m = p.matcher(line);
			while(m.find()) {
				// ��ȡ��ӡ
				System.out.println(m.group());
			}	
		}
	}
}
