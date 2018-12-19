class magnetChain{
    static int count = 0;
    static void chain(int x,int y, int max){
        if(y>=max || y<0)
            return;
        if(x == max-1){
            count++;
            return;
        }
        chain(x+1,y-1,max); // up
        chain(x+1,y,max);   // inline
        chain(x+1,y+1,max); // down
    }
    public static void main(String[] args) {
        int n = 4;
        chain(0,n-1,n);
        System.out.println(count);
    }
}
/*
this is magnet chain problem where we start from the bottom left corner
of the 2d matrix and reach the right end by either moving to next column
in the up or inline or down. such that there are no more than 1 chain in
each column.*/