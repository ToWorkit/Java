package demo13;

import java.io.FileWriter;

public class FileWriter01 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("F:\\a\\e.txt");
		fw.write("¸ãÆð£¬ÅÂ¸öµõ");
		fw.close();
	}
}
