class binaryString{
    static void recBinaryString(int i,int n,int[] arr){
        if(i == n){
            System.out.println();
            printarr(arr);
            return;
        }
        arr[i] = 0;
        recBinaryString(i+1, n, arr);
        arr[i] = 1;
        recBinaryString(i+1, n, arr);
    }
    static void printarr(int[] arr){
        for(int x:arr)
            System.out.print(x+" ");
    }

    public static void main(String[] args) {
        int n = 15;
        int arr[] = new int[n];
        recBinaryString(0,n,arr);
    }
}