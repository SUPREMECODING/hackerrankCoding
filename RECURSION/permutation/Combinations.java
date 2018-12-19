class Combinations{
    static void P(int i,int arr[],int max,char B[]){
        if(i == max){
            printarr(arr);
            return;
        }
        for(int b: B){
            arr[i] = b;
            P(i+1,arr,max,B);
        }
        
    }
    static void printarr(int arr[]){
        for(int i: arr)
            System.out.print((char)i+" ");
        System.out.println();
    }
    public static void main(String args[]){
        char basket[] = {'x','y','z'};
        int n = basket.length;
        int arr[] = new int[n];
        P(0,arr,n,basket);
    }
}