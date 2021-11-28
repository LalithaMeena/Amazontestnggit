package maven20102021.amazon.com;
import org.testng.annotations.*;
public class Day3_Expectedexcep {
	
	@Test
	private void add() {
		int a = 20;
		int b = 55;	
	System.out.println("Add:" +(a+b));
}
	@Test
	private void multiple() {
		int c = 12;
		int d = 6;
	System.out.println("Multiple value:" +(c*d));
}
	@Test
	private void division() {
		int e = 100;
		int f = 25;
	System.out.println("Division value :"+(e/f));
}
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
		int g = 50;
		int h = 0;
	System.out.println("Division value :"+(g/h));
}
	@Test
	private void sub() {
		int i = 55;
		int j = 35;
	System.out.println("sub:" +(i-j));
}	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	private void array() {
	  int[] k = new int[4];
	
		k[0] = 2;
		k[1] = 4;	
		k[2] = 5;
		k[3] = 3;
		k[4] = 1;
		
	int length = k.length;
		System.out.println(length);
	for (int i = 0; i < k.length; i++) { 
			System.out.println(k[i]);
  }
  }
  }