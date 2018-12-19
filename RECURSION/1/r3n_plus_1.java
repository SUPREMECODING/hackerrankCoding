class r3n_plus_1{
    static int rec3n_1(int n){
        System.out.print(" ->"+n);
        if(n == 1) return 1;
        if(n%2==0) return rec3n_1(n/2);
        return rec3n_1(3*n+1);
    }
    public static void main(String[] args) {
        rec3n_1(10);
    }
}