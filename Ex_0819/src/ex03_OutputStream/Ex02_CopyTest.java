package ex03_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex02_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\web0900_hjw/wall.jpg");
			out = new FileOutputStream("C:\\web0900_hjw/wall_copy.jpg");
			
			//현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			//읽어서
			while((read = in.read()) != -1) {
				//쓴다.
				out.write(read);
			}
			
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start)/1000;
			System.out.println(time + "초");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(out != null) {
					out.close();
				}
				
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
