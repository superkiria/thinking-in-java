public class Ex08 {
	public static void main(String args[]) {
		First a = new First();
		a.i = 144;
		First b = new First();
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(First.i);
	}
}
class First {
	public static int i;
}
