class fibo{

    int[] getFib(int n){
        int arr[] = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i< n; i++)
            arr[i] = arr[i-1]+ arr[i-2];

        return arr;
    }

    public static void main(String[] args) {
        fibo ob= new fibo();
        int res[];
        res = ob.getFib(40);
        for(int r: res)
            System.out.print(r+"\t");
    }

}