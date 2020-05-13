package chapter01.loop;

public class PrettyGugudan {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {  // (i) * j = n
			for(int j = 1; j <= 9; j++) { // j * i = n
				System.out.print(j + " X " + i + " = " + (j*i));
				System.out.print("\t");
			}
			System.out.println("");
		}		
	}
}
