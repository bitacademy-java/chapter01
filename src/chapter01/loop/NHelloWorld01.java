package chapter01.loop;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		int i = 0;
		while(i < count) {
			System.out.println("Hello World");
			i++;
		}
		
		s.close();
	}

}
