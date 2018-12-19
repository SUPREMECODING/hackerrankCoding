class HeapSort {
    int heapSize;
    int heap[];
    public void BuildMaxHeap(int Arr[]){
        
    }
    public void MaxHeapify (int Arr[],int i){
        int l = 2*i, r = 2*i +1, max = i;

        if( l <= heapSize && Arr[l] > Arr[max] )
            max = l;
        if( r <= heapSize && Arr[r] > Arr[max] )
            max = r;
        if( max != i ){
            Arr[max] = Arr[max] + Arr[i];
            Arr[i] = Arr[max] - Arr[i];
            Arr[max] = Arr[max] - Arr[i];

            MaxHeapify(Arr, max);
        }
        
    }
    public static void main(String[] args) {
        
    }
}