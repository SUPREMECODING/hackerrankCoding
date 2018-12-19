class symmetric{
    static boolean recSymmetric(int l,int r,int arr[]){
        if(l>=r)
            return true;
        if(arr[l] == arr[r])
            return recSymmetric(l+1, r-1, arr);
        else
            return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(recSymmetric(0, arr.length-1, arr));
    }
}