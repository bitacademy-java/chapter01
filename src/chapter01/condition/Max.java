package chapter01.condition;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt(); // blocking
		int a2 = s.nextInt(); // blocking
		int a3 = s.nextInt(); // blocking

		int max = 0;
		
		if (a1 >= a2) {  // a1 >= a2
			if(a1 >= a3) { // a1 > a2 , a1 > a3 
				max = a1;
			} else {       // a1 > a2 , a1 <= a3 ----> a3 >= a1 > a2 
				max = a3;
			}
		} else { // a2 > a1
			if(a2 >= a3) { // a2 > a1, a2 >= a3
				max = a2;
			} else {       // a2 > a1, a3 > a2  ----> a3 > a2 > a1
				max = a3;
			}
			
		}
		
		System.out.println("max:" + max);
	}

}
