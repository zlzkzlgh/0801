package ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_BufferedWriter {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			reader = new FileReader("C:\\web0900_hjw/ex_0819.txt");
			writer = new FileWriter("C:\\web0900_hjw/ex_0819_copy.txt");
			
			//보조스트림 생성하기
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			//문장을 저장할 변수
			String str = "";
			
			//메모장에 있는 내용을 읽어와서 복사하기
			//readLine(), Write(),
			while((str = br.readLine()) != null) {
				bw.write(str +"\n");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bw != null)bw.close();
				if(writer != null)writer.close();
				if(br != null)br.close();
				if(reader != null)reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
