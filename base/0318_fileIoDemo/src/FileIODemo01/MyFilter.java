package FileIODemo01;

import java.io.File;
import java.io.FileFilter;

/*
 * 过滤器
 * FileFilter接口的实现类
 */

public class MyFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// 以 .text 结尾
		return pathname.getName().endsWith(".text");
	}

}
