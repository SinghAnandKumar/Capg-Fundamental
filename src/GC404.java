
public class GC404 {
	private static int x = 1;

	static void m1(int x, int y) {
		x++;
		y++;
	}

	public static void main(String[] args) {
		int y = 3;
		m1(x, y);
		System.out.println(x + "," + y);
	}
}
