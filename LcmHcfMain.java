import java.util.Scanner;
abstract class HcfLcm{
    abstract int find(int n1,int n2);
}
class HCF extends HcfLcm {
    public int find(int n1,int n2){
        int res = Math.min(n1, n2);
        
        while(true){
            if((n1%res == 0) &&( n2%res == 0))
                break;
            res--;
        }
        return res;
    }
}
class LCM extends HcfLcm{
    public int find(int n1,int n2){
        int res = Math.max(n1, n2);
        while(true){
            if((res%n1 == 0) &&( res%n2 == 0))
                break;
            res++;
        }
        return res;
    }    
}
class LcmHcfMain{
    public static void main(String[] args) {
        var sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        HcfLcm h;
        h = new LCM();        
        System.out.printf("The LCM of %d and %d is = %d%n", n1, n2, h.find(n1,n2));
        h = new HCF();
        System.out.printf("The HCF of %d and %d is = %d%n", n1, n2, h.find(n1,n2));
    }
}