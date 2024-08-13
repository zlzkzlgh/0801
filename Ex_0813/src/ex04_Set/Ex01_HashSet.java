package ex04_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {
	public static void main(String[] args) {
		
		//HashSet 선언하기
		Set<String> hs1 = new HashSet<>();
		//HashSet 데이터 저장
		//HashSet은 데이터를 저장할 때 순서를 부여하지 않고 데이터의 중복을 허용하지 않는다.
		//동일한 값, 또는 객체를 허용하지 않는다는 의미이다.
		//동일한 객체란, 꼭 같은 타입의 객체를 의미하는 것은 아니다.
		//HashSet은 데이터를 객체의 hashCode()값을 호출하여 비교하고
		//같으면 equals()메서드를 호출하여 다시 비교해 두 객체가 같음을 증명한다.
		hs1.add("a");
		hs1.add("d");
		hs1.add("f");
		hs1.add("c");
		hs1.add("b");
		System.out.println(hs1);
		
		hs1.add("a");
		hs1.add("b");
		System.out.println(hs1);
		
		//set에 저장되어 있는 데이터 제거하기
		//index를 지원하지 않기 때문에 순서에 의한 삭제는 지원하지 않는다.
		hs1.remove("a");
		System.out.println(hs1);
		
	}
}
