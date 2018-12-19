import java.io.*;
import java.util.*;

class evenOdd{
    static void printArr(int arr[]){
        for(int i: arr)
            System.out.print(i+"\t");
        System.out.println();
    }

    static void sortArray(int arr[]){
        int evenIn = 0;
        int oddIn = 1;
        
        while(true){
            while( evenIn < arr.length && arr[evenIn]%2 == 0 ){
                evenIn += 2;
            }
            while( oddIn < arr.length && arr[oddIn]%2 == 1 ){
                oddIn += 2;
            }
            if(evenIn < arr.length && oddIn < arr.length){
                int temp = arr[evenIn];
                arr[evenIn] = arr[oddIn];
                arr[oddIn] = temp;
            }
            else
                break;
        }
    }

    public static void main(String ar[]) throws IOException
    {
        int arr[] = { 3, 6, 12, 1, 5, 8 };
        printArr(arr);
        sortArray(arr);

        printArr(arr);

    }
}