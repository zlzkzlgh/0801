package ex01_super;

//부모역할을 하는 클래스
public class Parent {
	
	//부모가 가진 필드
	int money = 10000000;
	
	//모든 클래스는 생성자를 가진다.
	public Parent(int n) {
		System.out.println("부모(Parent)클래스" + n);
	}
}
