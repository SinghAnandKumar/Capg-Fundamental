
public class GFC305 {
	  static void m1(int[] i1, int[] i2) {
		    int i = i1[0]; i1[0] = i2[0]; i2[0] = i;
		  }
		  public static void main (String[] args) {
		    int[] i1 = {1}, i2 = {3}; m1(i1, i2);
		    System.out.print(i1[0] + "," + i2[0]);
		}}

