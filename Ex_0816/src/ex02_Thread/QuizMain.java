package ex02_Thread;

import java.util.Random;
import java.util.Scanner;

class QuizThread extends Thread{
	public void startGame() {
		Random rnd1 = new Random();
		Random rnd2 = new Random();
		Scanner sc = new Scanner(System.in);
		int ran1 = rnd1.nextInt(100)+1;
		int ran2 = rnd2.nextInt(100)+1;
		for()
	}
}


public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}
