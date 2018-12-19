class subsetSum{
    static int[][] SSum(int sub[],int w){
        int n= sub.length,i,j;
        int m= w+1;
        int[][] ss = new int[n][m];

        for(i =0;i<m;i++)
            ss[0][i] = 0;
        for(i=0;i<n;i++)
            ss[i][0] = 1;
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if(sub[i] <= j){
                    if((ss[i-1][j-sub[i]]==1 )||(ss[i-1][j] == 1))
                        ss[i][j] = 1;
                    else 
                         ss[i][j] = 0;
                }
                else
                    ss[i][j] = ss[i-1][j];
            }
        }
        return ss;
    }
    public static void main(String[] args) {
        int[] sub = {0,10,20,30,40,50};
        int w = 151;
        int[][] res = SSum(sub,w);

        System.out.println(res[sub.length-1][w]);
    }
}