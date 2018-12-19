import java.util.Scanner;

class Ruby{
    static int b,g,r,y;
    static int bFunc(int b){
        if(b == 0) return 0;
        int LST = bFunc(b-1);
        int RST = rFunc(r);
        return Math.max(LST, RST)+1;
    }
    static int rFunc(int r){
        if(r == 0) return 0;
        int LST = gFunc(g);
        int RST = yFunc(y);
        return Math.max(LST, RST)+1;
    }
    static int gFunc(int g){
        if(g == 0) return 0;
        int LST = gFunc(g-1);
        int RST = yFunc(y);
        return Math.max(LST, RST)+1;
    }
    static int yFunc(int y){
        if(y == 0) return 0;
        int LST = bFunc(b-1);
        int RST = rFunc(r-1);
        return Math.max(LST, RST)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        r = sc.nextInt();
        y = sc.nextInt();
        g = sc.nextInt();
        sc.close();
        System.out.println(Math.max(bFunc(b), rFunc(r)));
    }
}