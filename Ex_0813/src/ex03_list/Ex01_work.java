package ex03_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex02_list.Person;

public class Ex01_work {
	public static void main(String[] args) {
		//아이디 생성 : abc
		//abc
		//아이디 생성 : abc2
		//abc abc2
		//아이디 생성 : abc2
		//중복된 아이디
		//아이디 생성 : abc3
		//abc abc2 abc3
		
		//리스트의 요소가 개수가 4개이면 프로그램 종료
		
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
	
		/*outer:*/while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			//리스트에 중복이 되는 아이디가 있는지 검증
//			for(int i = 0; i < list.size(); i++) {
//				if(id.equals(list.get(i))) {
//					System.out.println("중복된 아이디");
//					continue outer;
//				}
//			}
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			
			list.add(id);
			System.out.println(list);
			System.out.println("---------");
			if(list.size() == 4) {
				break;
			}
		}
		
		
	}
}
