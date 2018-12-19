import java.util.*;

class City{
    static int d;
    static HashMap Travel;
    static int CT(int S,int d,int X,Hashtable ht){
        if(S<=0) return 0;
        if(Travel.get(d) != null)
            return ((Integer)Travel.get(d)).intValue();
        if(ht.get(d) == null){
            int incD = d+1;         
            Travel.put(d, 1+CT(S-X,incD,X,ht));
            return 1+CT(S-X,incD,X,ht);
        }
        int incD = d+1;
        Integer dist = (Integer)ht.get(d);
        Travel.put(d, 1+CT(S-dist.intValue(),incD,X,ht));
        return 1+CT(S-dist.intValue(),incD,X,ht);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S,X,N,T,Y;
        Hashtable ht = new Hashtable();
        Travel = new HashMap();
        S = sc.nextInt();
        X = sc.nextInt();
        N = sc.nextInt();

        for(int i = 0; i< N; i++){
            T = sc.nextInt();
            Y = sc.nextInt();
            ht.put(Integer.valueOf(T), Integer.valueOf(Y));
        }
        sc.close();
        System.out.println(CT(S,1,X,ht));
    }
}