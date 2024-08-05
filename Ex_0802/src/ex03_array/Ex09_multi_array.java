package ex03_array;

public class Ex09_multi_array {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;

		// 2차원배열에 접근하기 위한 주소
		System.out.println("2차원 배열 : " + arr);

		// 2차원 배열에 요소인 첫번째 1차원 배열의 주소
		System.out.println("2차원 배열 1행 : " + arr[0]);

		// 행의 크기
		System.out.println("2차원 배열의 크기 : " + arr.length);

		// 각 1차원 배열의 크기
		System.out.println("첫번째 1차원 배열의 크기 : " + arr[0].length);
		System.out.println("두번째 1차원 배열의 크기 : " + arr[1].length);

		// 첫번째 데이터 출력하기
		System.out.println("arr[0][0] : " + arr[0][0]);

		// 각각의 1차원 배열들이 갖고 있는 요소의 개수를 미리 정하지 않고
		// 만드는것이 가능하다.
		int[][] iArr = new int[3][];

		iArr[0] = new int[2]; // 요소를 두개 갖는다.
		iArr[1] = new int[3]; // 요소를 세개 갖는다.
		iArr[2] = new int[1]; // 요소를 한개 갖는다.

		int n = 0;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.println((iArr[i][j] = n += 100) + " ");
			}
			System.out.println();
		}

	}
}
