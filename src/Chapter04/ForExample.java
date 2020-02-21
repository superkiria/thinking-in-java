package Chapter04;

public class ForExample {
    public static void main(String[] args) {
        Object a = 1, b = 5, c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for (short i = 1, j = 5, k = 10; i < 10; i++) {
            System.out.println(i);
        }
        for (int q = 0; q < 10; q++, q++, q--) {
            q++;
            System.out.println(q);
        }
    }
}
