package ex03_method;

public class BreadMain {
	public static void main(String[] args) {
		//makeBread()메서드를 만든다.
		//오버로딩을 통해서 다음과 같은 결과를 출력해주세요.
		//첫번째 makeBread()
		//빵을 만들었습니다.
		
		//두번째 makeBread()
		//빵을 만들었습니다.
		//빵을 만들었습니다.
		//...
		//빵을 만들었습니다.
		//요청하신 N개의 빵을 만들었습니다.
		
		//세번째 makeBread()
		//xx빵을 만들었습니다.
		//xx빵을 만들었습니다.
		//...
		//xx빵을 만들었습니다.
		//요청하신 N개의 xx빵을 만들었습니다.
		
		Bread br = new Bread ();
		br.makeBread();
		br.makeBread(3);
		br.makeBread(3,"소보로");
		
		
	}
}
