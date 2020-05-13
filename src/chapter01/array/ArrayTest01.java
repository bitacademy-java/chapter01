package chapter01.array;

public class ArrayTest01 {
	public static void main(String[] args) {
		int student01Score = 100;
		int student02Score = 80;
		int student03Score = 90;
		int student04Score = 70;
		int student05Score = 100;
		int student06Score = 100;
		
		int average = (student01Score + student02Score + student03Score + student04Score + student05Score + student06Score ) / 6;
		
		System.out.println(average);
		
		int[] scores = new int[6];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 90;
		scores[3] = 70;
		scores[4] = 100;
		scores[5] = 100;
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		average = sum / scores.length;
		System.out.println(average);
		
	}

}
