package Chapter04;

import java.util.Arrays;

public class Ex24 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        vampireNumbersWithStringComparison();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    public static void vampireNumbersWithStringComparison() {
        for (int left = 1000; left < 10000; left++) {
            for (int right = Math.max(10000000 / left + 1, left); right < 10000; right++) {
                int composition = left * right;
                char[] charsOfComposition = Integer.toString(composition).toCharArray();
                StringBuilder numbers = new StringBuilder();
                char[] charsOfNumbers =  numbers.append(left).append(right).toString().toCharArray();
                Arrays.sort(charsOfComposition);
                Arrays.sort(charsOfNumbers);
                if (Arrays.equals(charsOfComposition, charsOfNumbers)) {
                    System.out.println(composition + " " + left + " " + right);
                }
            }
        }
    }
}
