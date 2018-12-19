import java.math.BigInteger;
import java.util.*;

class ArrayPartition{
    static int DS[];
    static int DSfindRepresentative(int i){
        if(DS[i] == -1)
            return i;
        return DSfindRepresentative(DS[i]);
    }
    static void DSunion(int i,int j){
        int findP1 = DSfindRepresentative(i);
        int findP2 = DSfindRepresentative(j);

        DS[findP2] = findP1;
        DS[findP1] = -1;
    }
    static boolean checkCommonFactors (int a,int b){        
        int GCD = 0;
        while (b != 0){
            GCD = b;
            b = a % b;
            a = GCD;
        }
        if(GCD == 1)
            return false;
        else
            return true;
    }
    static int solve(int A[],int MAX){
        int i = 0, j = 0;
        for(i = 0; i < MAX; i++){
            if(!checkPrime(A[i]))
            for(j = 0; j < MAX; j++){
                if(i != j&& A[j] != 1 && checkCommonFactors(A[i],A[j]))
                    DSunion(i,j);
            }
        }
        int count = 0;
        for(int k: DS)
            if(k == -1)
                count++;
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int test_case = sc.nextInt();
        for(int t_c = 0; t_c < test_case; t_c++){
            int N = sc.nextInt();
            int arr[] = new int[N];        
            DS = new int[N];
            Arrays.fill(DS,-1);
            for(int i = 0 ; i < N; i++){
                arr[i] = sc.nextInt();
            }            
            int res = solve(arr,N);
            //System.out.println(res);
            System.out.println((int)(Math.pow(2, res) - 2));
        }

        sc.close();
    }
}