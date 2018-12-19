import java.math.BigInteger;
import java.util.*;
class superDigit{
    static BigInteger DS(BigInteger p,BigInteger s){
        if(p.compareTo(BigInteger.valueOf(0))==0)
            return s;
        //System.out.println(p.mod(BigInteger.valueOf(10)) + "-" + s);
        //BigInteger b[] = p.divideAndRemainder(BigInteger.valueOf(10));
        s = s.add(p.mod(BigInteger.valueOf(10)));
        return DS(p.divide(BigInteger.valueOf(10)), s);
    }
    static BigInteger supD(BigInteger p){
        if(p.divide(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(0))==0)
            return p;
        return supD(DS(p,BigInteger.valueOf(0)));
    }
    static BigInteger recSuperDigit(BigInteger n, int k) {
        BigInteger ds1 = DS(n,BigInteger.valueOf(0));
        BigInteger ds2 = ds1.multiply(BigInteger.valueOf(k));
        BigInteger res = supD(ds2);
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        BigInteger n =new BigInteger(nk[0]);

        int k = Integer.parseInt(nk[1]);

        BigInteger result = recSuperDigit(n, k);

        System.out.println(result);
    }
}