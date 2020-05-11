package chapte01;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt(); // blocking
		int n2 = s.nextInt(); // blocking
		
		if(n2 > n1) {
			// n2와 n1를 바꿔준다.(swap 알고리즘)
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		// n1이 큰 값이 되도록 출력 할 것
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
	}

}
