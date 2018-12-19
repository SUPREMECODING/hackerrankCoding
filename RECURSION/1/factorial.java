class factorial{
    static int recFact(int n){
        if(n == 1)
            return 1;
        return n*recFact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(recFact(5));
    }
}