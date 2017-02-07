/**
 * Created by User on 07.02.2017.
 */
public class GCD {

    public static int gcdBit(int a, int b) {
        int counter = 0;
        if (a == 0) return b;
        if (b == 0) return a;
        int shift;
        for (shift = 0; ((a | b) & 1) == 0; ++shift) {
            a >>= 1;
            b >>= 1;
        }
        while ((a & 1) == 0)
            a >>= 1;
        do {
            counter++;
            while ((b & 1) == 0) {
                b >>= 1;
            }
            if (a > b) {
                int tmp = b;
                b = a;
                a = tmp;
            }
            b = b - a;
        } while (b != 0);
        System.out.println(a);
        System.out.println("Counter: " + counter);

        return a << shift;
    }
    public static int simpleGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
