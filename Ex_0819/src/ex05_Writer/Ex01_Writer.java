package ex05_Writer;

import java.io.FileWriter;

public class Ex01_Writer {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\web0900_hjw/fileWriter예제.txt",true);
			fw.write("첫번째 줄 작성합니다.");
			fw.write("\n");
			fw.write("두번째 줄도 문제없음");
			fw.write("\n");
			System.out.println("작성완료");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
