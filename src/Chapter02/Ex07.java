public class Ex07 {
	public static void main(String[] args) {
		Incrementable sf = new Incrementable();
		sf.increment();
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}
}
class Incrementable {
	static void increment() {
		StaticTest.i++; }
}
class StaticTest {
	static int i = 1; //not 47
}
