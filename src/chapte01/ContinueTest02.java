package chapte01;

public class ContinueTest02 {

	public static void main(String[] args) {
		
		// 1~10 중에 5보다 작은 수만 출력하세요.
		for(int i = 1; i <= 10; i++) {
			/* 코드 작성 */
			if(i >= 5) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
