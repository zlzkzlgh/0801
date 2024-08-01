package ex03_operator;

import java.util.Scanner;

public class Ex08_Operator {
	public static void main(String[] args) {
		//과수원에서 배, 사과, 오렌지를 하루에 각각 5,7,5개씩 생산한다.
		//1.과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2.시간당 총 생산량 구하기
		
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int fruit = pear + apple + orange;
		System.out.printf("하루에 생산되는 과일은 %d 개 입니다\n",fruit);
		
		double output = (double)fruit/24;
		System.out.printf("시간당 총 생산량은 %.3f 입니다\n",output);
		
		
		//-------------------------------------------------
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다
		//만일 농구공이 23개라면 몇개의 상자가 필요한가?
		//삼항연산자
		//박스의 개수 : 공의 개수가 5로 나누어 떨어지면 몫만큼 필요
		//공의 개수가 5로 나눠 떨어지지 않으면 몫 + 1만큼 필요
		
		
		int ball = 23;	//공의 개수
		int n = 5; 	//담을 수 있는 개수
		
		int result = ball % n == 0 ? ball/n : ball/n+1;
		System.out.println(result);
		
		//---------------------------------------------
		
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1. 세과목에 대한 합계 출력하기
		//2. 평균 출력하기 (합계/3.0)
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점이상일 때 합격
		//아니면 불합격
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : ");
		int korean = scan.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int english = scan.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int math = scan.nextInt();
		
		int total = korean + english + math;
		System.out.printf("세 과목의 점수 합계는 %d 입니다\n",total);
		
		double avg = (double)total/3.0;
		System.out.printf("세 과목의 점수 평균은 %.2f 입니다\n",avg);
		
		String result1 = (korean >= 40 && english >= 40 && math >=40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(result1);
		
	}
}
