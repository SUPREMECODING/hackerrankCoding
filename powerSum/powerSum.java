import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class powerSum {
    static int raisedTo;
    static int ps(int i,int X){
        if(X==0) return 1;
        if(X<0 || i > X || power(i) > X)  return 0; 
        int b = ps(i+1,X);
        int a = ps(i+1,X-power(i));        
        return a+b;
    }
    static int recPowerSum(int X, int N) {
        raisedTo = N;
        return ps(1,X);
    }

    static int power(int a){
        return (int)Math.pow(a, raisedTo);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int X = scanner.nextInt();

        int N = scanner.nextInt();

        int result = recPowerSum(X, N);

        System.out.println(result);

    }
}
