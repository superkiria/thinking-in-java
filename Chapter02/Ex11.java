public class Ex11 {
	public static void main(String args[]) {
		AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow();
		System.out.println(a.currentHue());
		a.changeTheHueOfTheColor(2);
		System.out.println(a.currentHue());
	}
}
class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}
	int currentHue() {
		return anIntegerRepresentingColors;
	}
}
