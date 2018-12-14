public class Ex06 {
	public static void main(String args[]) {
		String s = "The String";
		System.out.printf("To store string '%s' it takes %d bytes.%n", s, storage(s));
	}
	static int storage(String s) {
		return s.length() * 2;
	}
}
