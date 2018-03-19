package comitstar.demo01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetMail {
	public static void main(String[] args) throws Exception {
		//1��ȡ��ҳ��ַ
		URL url = new URL("http://bbs.tianya.cn/post-funinfo-3330777-1.shtml");
		//2����ҳ
		URLConnection urlc = url.openConnection();
		//3����ʱ����
		urlc.setConnectTimeout(1000*10);
		//4�����ݣ���ȡ��ҳ���������룩
		BufferedReader bufreader = new BufferedReader(new InputStreamReader(urlc.getInputStream(), "GBK"));
		
		//5������ϴ���� ��ʾ����
		String reg = "[a-zA-Z0-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
		//6����
		Pattern p = Pattern.compile(reg);
		
		String line = null;
		
		while((line = bufreader.readLine())!=null) {
			//7ƥ��
			Matcher m = p.matcher(line);
			while(m.find()) {
				//8��ȡ��ӡ
				System.out.println(m.group());
			}
			
		}
		
		
	}
}
