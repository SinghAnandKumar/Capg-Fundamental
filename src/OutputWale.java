
public class OutputWale {
//	  static int m1(int x) {return ++x;}
	  static int x=1;	
	  static void m1(int i) {x++; i++;}

	public static void main (String[] s) {
		
//	    System.out.print(s[1] + s[2] + s[3]);
//		int x = 1;
//	    int y = m1(x);
//	    System.out.println(x + "," + y);

		int y=3; m1(y);
	    System.out.println(x + "," + y);


	}

}
