import java.math.BigInteger;
import java.util.Scanner;

class fact{
    static String fact(int n){
        BigInteger res = new BigInteger("1");
        for(int i = n; i>=1; i--){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = fact(n);

        System.out.println(str);
    }
}