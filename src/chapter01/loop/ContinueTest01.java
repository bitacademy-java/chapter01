package chapter01.loop;

public class ContinueTest01 {

	public static void main(String[] args) {
		
		// 2의 배수와 3의 배수를 빼고 출력
		for (int i = 0; i < 20; i++) {

//			if (i % 2 == 0 || i % 3 == 0) {
//				continue;
//			}

			if( i % 2 == 0) {
				continue;
			}
			
			if( i % 3 == 0) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
