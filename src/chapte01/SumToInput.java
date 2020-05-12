package chapte01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력>");
		int number = scanner.nextInt();

		// 처리 0 ~ number 까지 합
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			sum += i;
		}
		
		// 출력
		System.out.println(sum);
		
		// 자원정리
		scanner.close();
	}
}
