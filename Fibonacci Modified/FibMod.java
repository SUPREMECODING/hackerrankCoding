import java.math.BigInteger;
import java.util.*;

class FibMod{

    public static BigInteger fibonacciModified(int t1,int t2,int n){
        HashMap<Integer,BigInteger> hm = new HashMap<Integer,BigInteger>();
        Stack<BigInteger> st = new Stack<BigInteger>();
        int i=1;
        BigInteger b1,b2,res=null;
        hm.put(Integer.valueOf(1),BigInteger.valueOf(t1));
        hm.put(Integer.valueOf(2),BigInteger.valueOf(t2));
        for(i = 3; i<= n;i++){
            b1 = hm.get(Integer.valueOf(i-1));
            b2 = hm.get(Integer.valueOf(i-2));
            b1 = b1.multiply(b1);  //b1 = b1*b1
            res = b1.add(b2);  // a[i] = a[i-2] + a[i-1]*a[i-1]
            hm.put(i,res);
        }

        return res;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger result = fibonacciModified(t1, t2, n);

        System.out.println(result);
    }
}