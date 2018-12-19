class matrixMult{
    static int large = 100000;
    static int[][] matrixChain(int p[]){
        int n = p.length,l,i,j;
        int m[][] = new int[n+1][n+1];
        for(i=1;i<n;i++)
            m[i][i]=0;
        for(l=2; l<= n;l++  ){
            for(i = 1; i< (n-l+1); i++){
                j = i+l-1;
                m[i][j] =  large;
                for(int k = i; k< j; k++){
                    int temp = m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                    if(m[i][j]>temp)
                        m[i][j]=temp;
                }
            }        
        }
        return m;
    }

    public static void main(String[] args) {
        int p[] = {1,2,1,4,1};
        int res[][] = matrixChain(p),i,l,n = p.length,j;
        
        for(i=1;i<n;i++)
           System.out.print(res[i][i]+"\t");
        for(l=2; l<= n;l++  ){
            System.out.println();
            for(i = 1; i< (n-l+1); i++){
                j = i+l-1;
                System.out.print(res[i][j]+"\t");
                
            }        
        }
        System.out.println("minimum scalar multiplications = "+res[1][n-1]);
        
    }
}