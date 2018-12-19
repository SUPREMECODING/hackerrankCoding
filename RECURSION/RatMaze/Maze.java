class Maze{
    static int countPaths = 0;

    static int move(int x,int y,int[][] arr, int max){
        if(x>=max || y>= max || arr[x][y] == 0)
            return 0;
        if(x == max-1 && y== max-1){
            //countPaths++;
            return 1;
        }
        int a = move(x,y+1,arr,max);
        int b = move(x+1,y,arr,max);
        return a+b;
    }
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},   // 0 = blocked, 1 = path
                {1, 0, 1, 0},
                {1, 1, 1, 0},
                {0, 0, 1, 1}
                };
        countPaths = move(0,0,maze,maze.length);
        System.out.println(countPaths);
    }
}