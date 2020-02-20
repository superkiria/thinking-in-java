import static java.lang.System.out;

class Ex10 {
    public static void main(String... args) {
        int a = 0x55555555;
        int b = 0xaaaaaaaa;
        print(a);
        print(b);
        print(a | b);
        print(a & b);
        print(a ^ b);
        print(~a);
        print(~b);
        out.println(true ^ false);
        int c = -10;
        print(c);
        print(c << 2);
        print(c >> 2);
        print(c >>> 2);
        out.println(c >>> 2);
    }

    public static void print(int i) {
        out.println(Integer.toBinaryString(i));
    }
}
