package Chapter02;

public class Ex10 {
	public static void main(String args[]) {
		if (args.length >= 3) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		} else {
			System.out.println("Error: not 3 arguments");
		}
	}
}
