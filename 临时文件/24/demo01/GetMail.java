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
		//1获取网页地址
		URL url = new URL("http://bbs.tianya.cn/post-funinfo-3330777-1.shtml");
		//2打开网页
		URLConnection urlc = url.openConnection();
		//3处理超时问题
		urlc.setConnectTimeout(1000*10);
		//4拿数据（获取网页的所有输入）
		BufferedReader bufreader = new BufferedReader(new InputStreamReader(urlc.getInputStream(), "GBK"));
		
		//5正则清洗数据 表示邮箱
		String reg = "[a-zA-Z0-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
		//6编译
		Pattern p = Pattern.compile(reg);
		
		String line = null;
		
		while((line = bufreader.readLine())!=null) {
			//7匹配
			Matcher m = p.matcher(line);
			while(m.find()) {
				//8截取打印
				System.out.println(m.group());
			}
			
		}
		
		
	}
}
