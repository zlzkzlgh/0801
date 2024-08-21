package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int [] coin = {500,100,50,10};
		
		int money = (rnd.nextInt(500) + 1) * 10;
		System.out.println("돈 : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			money %= coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], res);
		}
	}
}
