package FileIODemo01;

import java.io.File;
import java.io.FileFilter;

/*
 * ������
 * FileFilter�ӿڵ�ʵ����
 */

public class MyFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// �� .text ��β
		return pathname.getName().endsWith(".text");
	}

}
