import java.math.BigInteger;
import java.util.*;

class Maze{

    static int findFibonacci(int n){
        if(n == 0)  return 0;
        if(n == 1)  return 1;

        return findFibonacci(n-1)+findFibonacci(n-2);
    }

    static int findPrime(int n){
        int count =0,j, c =0, i = 1;
        while(true){
            i++;
            count = 0;
            for( j = i ; j>= 1; j--){
                if(i%j == 0)
                    count++;
            }
            if(count == 2){
                    c++;
            }
            if(c == n)
            break;
        }
        return i;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),res=0;
        sc.close();
        if(n%2 == 0){
            n = n/2;
            res = findPrime(n);
        }
        else if(n%2 == 1){
            n = n/2 + 1;
            res = findFibonacci(n);
        }

        System.out.println(res);
    }
}