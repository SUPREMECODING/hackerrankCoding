class LongestCommonSubsequence{
    static int[][] LCS(String s1,String s2){
        char chars1[] = s1.toCharArray(),chars2[] = s2.toCharArray();
        int n1 = chars1.length,n2 = chars2.length;
        int c[][] = new int[n1+1][n2+1];
        int i, j;
        for(i=0;i<=n1;i++)
            c[i][0] = 0;
        for(i=0;i<=n2;i++)
            c[0][i] = 0;
        for(i=1;i<=n1;i++){
            for(j=1;j<=n2;j++){
                if(chars1[i-1] == chars2[j-1])
                    c[i][j] = 1+c[i-1][j-1];
                else
                    c[i][j] = Math.max(c[i-1][j],c[i][j-1]);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String s1 = "AAB",s2 = "ACA";
        int res[][] = LCS(s1, s2);
        for(int[] i: res){
            for(int j: i)
                System.out.print(j+"\t");
            System.out.println();
        }
        System.out.println("length of longest subsequence = "+ res[s1.length()][s2.length()]);
    }
}