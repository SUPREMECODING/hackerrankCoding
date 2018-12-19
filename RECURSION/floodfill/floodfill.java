class floodfill{
    static int countComponents = 0;
    static void recFloodfill(int x,int y,int[][] arr){
        if(y>=arr.length ||x>=arr[0].length || arr[x][y] == 0)
            return;
        arr[x][y] = 0;
        recFloodfill(x+1, y, arr);
        recFloodfill(x, y+1, arr);
        recFloodfill(x-1, y, arr);
        recFloodfill(x, y-1, arr);
    }

    public static void main(String[] args) {
        int arr[][]={
            {0 , 0 , 0 , 0 , 0},
            {0 , 1 , 1 , 0 , 1},
            {0 , 0 , 1 , 1 , 0},
            {0 , 1 , 1 , 1 , 0},
            {0 , 0 , 0 , 1 , 0}            
        };
        for(int i = 0 ; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1)
                    countComponents++;
                recFloodfill(i, j, arr);
            }
                

        for (int[] var : arr) {
            System.out.println();
            for(int x: var)
                System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(countComponents);
    }
}