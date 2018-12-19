class sum {
    static int recSum(int n){
        if(n==0)
            return 0;
        return n+recSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(recSum(5));
    }
}