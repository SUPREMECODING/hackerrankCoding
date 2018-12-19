class Permutations{
    static int visited[];
    static void P(int i,int arr[], int max,char B[]){
        if(i == max){
            printarr(arr);
            return;
        }
        for(int j = 0; j < max; j++){
            if(visited[j] == 0){
                arr[i]= B[j];
                visited[j] = 1;
                    P(i+1,arr,max,B);
                visited[j] = 0;
            }
        }
    }
    static void printarr(int arr[]){
        for(int i: arr)
            System.out.print((char)i+" ");
        System.out.println();
    }
    public static void main(String arg[]){
        char basket[] = {'x','y','z'};
        int n = basket.length;
        int arr[] = new int[n];
        visited = new int[n];
        
        P(0,arr,n,basket);
    }
}