class knap0_1{
    static int[][] knap(int p[],int w[],int c){
        int ks[][] = new int[p.length][c+1];
        int i,j,m = p.length,n = c+1,temp1,temp2;
        for(i=0;i<m;i++)
            ks[i][0] = 0;
        for(i=0; i< n; i++)
            ks[0][i] = 0;
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(w[i]<=j){
                    temp1= ks[i-1][j-w[i]] + p[i];
                    temp2= ks[i-1][j];
                    ks[i][j] = Math.max(temp1,temp2);
                }
                else
                    ks[i][j]=ks[i-1][j];
            }
        }
        
        return ks;
    }
    public static void main(String[] args) {
        int p[]={0,10,12,28};
        int w[]={0,1,2,4};
        int c=6;
        int res[][] = knap(p,w,c);

        for(int[] i: res){
            for(int j: i)
                System.out.print(j+"\t");
            System.out.println();
        }

        System.out.println("Maximum profit is = "+ res[p.length-1][c]);
        
    }
}