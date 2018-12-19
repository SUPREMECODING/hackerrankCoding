import java.util.*;
class Cityv2{
    static int CT(int S,int X,HashMap ht){
        int d = 0;
        while(S>0){
            d++;
            if(ht.get(d) == null)
                S -= X;
            else
                S = S - ((Integer)ht.get(d)).intValue();
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S,X,N,T,Y;
        HashMap ht = new HashMap();
        S = sc.nextInt();
        X = sc.nextInt();
        N = sc.nextInt();

        for(int i = 0; i< N; i++){
            T = sc.nextInt();
            Y = sc.nextInt();
            ht.put(Integer.valueOf(T), Integer.valueOf(Y));
        }
        sc.close();
        System.out.println(CT(S,X,ht));
    }
}