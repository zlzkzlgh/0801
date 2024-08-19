package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_FileInputStream {
	public static void main(String[] args) {
		
		String path = "C:\\web0900_hjw/test.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		
		//경로가 이상이 없는지, 존재하는지 검증을 하고 이상이 없으면
		//읽어와라
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				//한 바이트씩 읽어와서 담아줄 변수
				int code = 0;
				
				//read()메서드가 글자를 읽어오는 작업을 한다.
				//read()메서드는 텍스트를 읽어올 때 1byte씩 밖에 읽어올 수 없기 때문에
				//한글 데이터를 읽는게 불가능하다.(한글은 2~3byte이기 때문에)
				while((code = fis.read()) != -1) {
					//더이상 읽어올 단어가 없으면 문장의 끝(End Of File)인 -1을 반환한다.
					//아스키코드, 유니코드 어느곳에서도 -1의 의미를 갖고있는 것은 없기 때문이다.
					System.out.print((char)code);
				}
				//스트림은 사용이 완료된 이후 close를 통해 닫아주는것이 좋다.
				//그래야 다음 작업시 문제가 생기지 않는다.
				//close를 작성하지 않았을때 아직 할 작업이 남았다고 생각할 수
				//있기 때문에 화면에 띄우거나 파일을 만들면 안되겠구나 라고
				//착각할 수 있다.
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					//잘 읽어오던, 읽어오지 못하던 무조건 닫아야함
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
