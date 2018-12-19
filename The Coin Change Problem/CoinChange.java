import java.util.*;

class CoinChange{
    static long counter = 0;
    static void C(int[] sub,int i, int val) {
        if(val == 0){
            counter++;
            return;
        }
        if(i >=sub.length|| a[i] == 0){
            return;
        }
        if(sub[i]<=val){
            C(sub,i,val-sub[i]);
            C(sub,i+1,val);
        }
        else
            C(sub,i+1,val);        
        return;        
    }

    public static void main(String[] args) {
        int[] sub = {2, 5, 3, 6};
        int w = 10;
        C(sub,0,w);

        System.out.println(counter);
    }
}