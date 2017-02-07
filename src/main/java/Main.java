/**
 * Created by User on 07.02.2017.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(33%2);
        int a = 66;
        int b = 32;
        int shift;
        int count = 0;
        System.out.println(Integer.toString(a,2));
//        System.out.println(Integer.toString(33,2));
        System.out.println(Integer.toString(b, 2));
//        System.out.println(Integer.toString(a|b,2));
//        System.out.println(Integer.toString(1,2));
//        System.out.println(Integer.toString((a|b)&1,2));
        for(shift = 0;((a|b)& 1)==0;++shift){
            System.out.println(Integer.toString(a,2));
            System.out.println(Integer.toString(b, 2));
            a>>=1;
            b>>=1;
            System.out.println("-----------------");
        }
        System.out.println(shift);
        while ((a & 1) == 0) {
            count++;
            a >>= 1;
        }
        System.out.println(count);
//        System.out.println(Integer.toString(a,2));
//        System.out.println(Integer.toString(b, 2));
//        System.out.println(Integer.toString(a&b,2));
//        while((a&1) == 0){
//            a>>=1;
//        }
//        System.out.println(Integer.toString(a>>=1,2));
        System.out.println(GCD.gcdBit(21, 7));
    }
}
