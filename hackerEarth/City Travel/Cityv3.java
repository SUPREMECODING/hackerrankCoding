import java.util.*;

class Cityv3{
    static class ascendComparator implements Comparator{
        public int compare(Object s1,Object s2){
            String s1arr[] = ((String)s1).split(" ");
            String s2arr[] = ((String)s2).split(" ");
            int res = Integer.parseInt(s1arr[0]) - Integer.parseInt(s2arr[0]);
            if(res > 0) return 1;
            if(res < 0) return -1;
            return res;
        }
    }
    static long CT(long S,long X,int N,String EX[]){
        int i = 0;
        long r1,r2,d;
        String str[];
        while( i < N){
            r1 = (long)Math.ceil((double)S/X);            
            str = EX[i].split(" ");
            if(Long.parseLong(str[0]) <= r1){
                r2 = X - Long.parseLong(str[1]);
                S = S + r2;
            }
            i++;
        }
        d = (long)Math.ceil((double)S/X);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S,X,N,T,Y;
        
        String temp;
        S = sc.nextInt();
        X = sc.nextInt();
        N = sc.nextInt();

        String EX[] = new String[N];
        
        for(int i = 0; i< N; i++){
            T = sc.nextInt();
            Y = sc.nextInt();
            temp = "" + T + " " + Y;
            EX[i] = new String();
            EX[i] = temp;
        }        
        sc.close();
        Arrays.sort(EX,new ascendComparator());
        System.out.println(CT(S,X,N,EX));
    }
}