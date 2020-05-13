package chapter01.loop;

public class ContinueTest03 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			if (i > 5) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}