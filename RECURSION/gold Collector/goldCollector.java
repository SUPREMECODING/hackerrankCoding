class goldCollector{
    static int Collect(int i, int arr[]){
        if(i< 0 || i >= arr.length)
            return 0;
        int a = Collect(i+1,arr);
        int b = Collect(i+2,arr)+arr[i];
        return Math.max(a,b);
    }
    public static void main(String arg[]){
        int arr[] = {33,10,20,5,14,26}; //ans 79
        int amount = Collect(0,arr);
        System.out.println(amount);
    }
}