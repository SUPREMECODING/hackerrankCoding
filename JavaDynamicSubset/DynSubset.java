import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class DynSubset{
    static int count;
    // Complete the solve function below.
    public static int findHcf(int a,int b){
        for(int i = Math.min(a, b); i>=1;i--){
            if((a%i == 0) && (b%i == 0))
                return i;
        }
        return 0;
    }
    static int solve(List<Integer> a) {
        int arr[]= new int[a.size()];
        Iterator it = a.iterator();
        Integer in;
        int i = 0;
        while(it.hasNext()){
            in = (Integer)it.next();
            arr[i] = in.intValue();
            i++;
        }
        count = 0;
        return countSubset(arr, 0);
    }
    static int countSubset(int arr[],int i){
        int j;
        for(j=0;j<arr.length;j++)
            if(findHcf(arr[i],arr[j])==1)
                count++;
        i++;
        if(i >= arr.length )
            return count;
        else
        return countSubset(arr,i+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int aCount = Integer.parseInt(bufferedReader.readLine().trim());

            String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < aCount; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a.add(aItem);
            }

            int result = solve(a);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

