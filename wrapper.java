import java.util.*;
class Ascends implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1.intValue() > i2.intValue())
            return 1;
        else if (i1.intValue() == i2.intValue())
            return 0;

        else          
            return -1;
    }
}
class wrapper{
    
    public static void main(String[] args) //throws ConcurrentModificationException
    {
        Integer ar[] = {10,20 ,44, 40};
        Arrays.sort(ar,new Ascends());

        for(Integer i: ar)
            System.out.print(i+"\t");
    }
}