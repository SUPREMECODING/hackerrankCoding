import java.util.*;

class DynCoinChange{
    static long counter = 0;
    static boolean calcChange[][];
    static int test[][];
    
    static int C(int sub[],int i, int val) {
        if(val < 0) return 0;
        else if(val == 0) return 1;
        else if( i >= sub.length) return 0;
        else if(calcChange[i][val] == false){
            test[i][val] = C(sub,i,val-sub[i]) + C(sub,i+1,val);
            calcChange[i][val] = true;
        }

        return test[i][val];        
    }

    public static void main(String[] args) {
        
        int[] sub = {2,5,3,6};
        int w = 10;
        calcChange = new boolean[sub.length][w+1];
        test = new int[sub.length][w+1];

        C(sub,0,w);
        // for(int[] bool: test){            
        //     for(int b: bool)
        //         System.out.print(b+"\t");
        //     System.out.println();
        // }
            System.out.println(test[0][w]);
    }
}