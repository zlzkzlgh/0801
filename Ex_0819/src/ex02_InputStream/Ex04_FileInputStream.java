package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		//특정 경로에 file.txt문서를 만들고 아무 문장이나 입력해둔다.
		//file.txt의 내용을 읽어온 뒤, 회문인지 아닌지 판별해서 출력하시오.
		String path = "C:\\web0900_hjw/file.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				//read()메서드를 통해서 읽어온 내용을 read배열에 넣음
				fis.read(read);
				
				//read배열에 들어있는 모든 요소를 문자열로 바꿔서 넣음
				String ori = new String(read);
				String rev = "";
				
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}
				
				if(ori.equals(rev)) {
					System.out.println(ori + " 는 회문입니다.");
				}else {
					System.out.println(ori + " 는 회문이 아닙니다.");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

		}
	}
}
