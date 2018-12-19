import java.util.*;

class group {
    int value;
    String data;    
}
class groupAscend implements Comparator<group>{
    public int compare(group g1,group g2){
        return (g1.value >= g2.value)?1:-1;
    }
}


class sortObject{
    public static void main(String[] args)    {
        group arr[] = new group[10];
        int i=0;
        for(;i<arr.length; i++){
            arr[i] = new group();
            arr[i].value = 10-i;
            arr[i].data = "hello "+ i;
        }
        for(group g: arr)
            System.out.println(g.value+" - "+ g.data);
            
        Arrays.sort(arr,new groupAscend());
        
        for(group g: arr)
            System.out.println(g.value+" - "+ g.data);
    }
}