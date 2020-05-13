package chapter01.array;

public class ArrayTest02 {
	
	public static void main(String[] args) {
		int a1[];  //비추천
		int[] a2;  //추천
		
		//오류: 배열의 크기는 배열객체 생성(new)과 함께 해야 한다. 
		//int[10] a2;
		
		a2 = new int[3];
		a2[0] = 0;
		a2[1] = 1;
		a2[2] = 2;
		
		// 배열 생성과 초기화를 함께 하는 방법1(추천)
		int[] a3 = {0, 1, 2};
	
		// 배열 생성과 초기화를 함께 하는 방법2(비추천)
		int[] a4 = new int[] {0, 1, 2};
		
		// 배열 초기화 오류
		// int[] a4;
		// a4 = {0, 1, 2};
		
		
	}
}
