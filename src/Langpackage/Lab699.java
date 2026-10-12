package Langpackage;
import java.math.BigInteger;
public class Lab699 {
    public static void main(String[] args) {
        BigInteger bin1  = new BigInteger("78568755445343254574");
        BigInteger bin2  = new BigInteger("100");
        System.out.println(bin1.bitCount());
        System.out.println(bin1.bitLength());
//        long val =922337203685864824L;
//        long val2=100;
//        long res = val + val2;
        BigInteger res1 = bin1.add(bin2);
        System.out.println(res1);
    }
}
