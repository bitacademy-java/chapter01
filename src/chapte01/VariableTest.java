package chapte01;

public class VariableTest {

	public static void main(String[] args) {
		/*
		 *  1. 자료형(Date Type) : 기본형(primitive type) - 8개  
		 */
		
		//정수
		byte b = 10;        //1byte
		short s = 10;       //2byte
		int i = 10;         //4byte
		long l = 1234567;   //8byte
		//실수
		float f = 3.14f;     //4byte
		double d = 3.14;     //8byte
		//문자
		char c = '안';        //2byte
		//부울대수
		boolean bool = true;     //1byte

		/*
		 *  char 형  
		 */
		
		char c2 = 'A';
		int i2 = 65;
		System.out.println(i2 - c2);
		
		/*
		 *  2. 자료형(Date Type) : 객체 참조형(reference type)  
		 */		
		// 문자열 기본타입 아니다.
		// 문자열 기본 타입 char가 모여
		// 있는 String class 이다.
		String str = "Hello World";
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);

		System.out.println(bool);
		
		System.out.println(str);
		
		/*
		 * 3. 변수 초기화
		 */
		// 지역 변수는 반드시 초기화를 해야만 한다.
		// 안하면 무조건 오류
		// int j;
		// System.out.println(j);
		
		/*
		 * 4. 상수
		 */
		final int NUMBER = 1000;
		// 오류: 초기화시 final이 붙어 있는 변수는 다음코드에서 값을 대입할 수 없다.
		// NUMBER = 2000;
		
		final double PI = 3.1414213;
		
	}

}
