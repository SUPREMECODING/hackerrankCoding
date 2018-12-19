class RatMazeRevised{
    static int Rat(int x,int y,int maze[][]){
        if(x>=maze.length || x<0 || y>=maze.length || y<0|| maze[x][y] == 0 || maze[x][y] == -1)
            return 0;               // -1 = visited
        if(maze[x][y] == 2)
            return 1;
        maze[x][y] = -1;
        int a = Rat(x+1,y,maze);    //right
        int b = Rat(x,y+1,maze);    //down
        int c = Rat(x-1,y,maze);    //left
        int d = Rat(x,y-1,maze);    //up
        maze[x][y] = 1;
        return a+b+c+d;
    }
    public static void main(String args[]){
        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},   // 0 = blocked, 1 = path, 2 = goal
                {0, 1, 0, 2},
                {0, 1, 1, 1}
                };
        int paths = Rat(2,1,maze);
        System.out.println(paths);
    }
}