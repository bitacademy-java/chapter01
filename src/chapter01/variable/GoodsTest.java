package chapter01.variable;

public class GoodsTest {

	public static void main(String[] args) {
		int i = 10;
		
		Goods g1 = new Goods();
		g1.price = 1000;
		
		//===================================
		
		int j = i;
		Goods g2 = g1;

		//===================================

		System.out.println(j + ":" + i);
		System.out.println(g2.price + ":" + g1.price);
		
		//===================================
		System.out.println(i + ":" + g1);
		
		String s = "Hello World";
		System.out.println(s);		

	}

}
