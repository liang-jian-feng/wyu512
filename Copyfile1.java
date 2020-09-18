package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class Copyfile1 {
	public static void main(String[] args) throws IOException {
		//使用缓冲流读取note.txt文件，并将每行字符串输出到控制台上
		String fileSrc = "C:/Users/ASUS/Desktop/JMPX/note.txt";
		String fileDes = "C:/Users/ASUS/Desktop/JMPX/note_cp.txt";
		InputStream fis = null; // 声明输入流对象
		OutputStream fos = null; // 声明输出流对象
		try {
			fis = new FileInputStream(fileSrc);
			fos = new FileOutputStream(fileDes);
			long num = 0; // 读取字节计数
			int bt = 0; // 每次读入字节内容
			// 当读入文件末尾时，读入数据的值为-1，每次读入一个字节，存放变量bt中，直到读完整个文件
			while ((bt = fis.read()) != -1) {
				// 以字母的形式逐个输出文件的每个字节
				fos.write(bt); // 将字节写入输出流中，实现copy功能
				num++;
			}
			System.out.println("读取的字节数为" + num + "\n 文件复制成功");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
