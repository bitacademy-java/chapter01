package chapter01.operator;

public class Relation {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println(a > b);
		System.out.println(a < b);
		
		System.out.println(a >= b);
		System.out.println(a <= b);

		System.out.println(a >= b - 10);
		System.out.println(a - 10 <= b);

		boolean bool = (a == b);
		System.out.println(bool);
	}

}
