import java.util.*;

class tempHs{
    Integer key;
    Integer val;
}
class hmAscend implements Comparator<tempHs>
{
    public int compare(tempHs t1,tempHs t2){
        return t1.val.compareTo(t2.val);
    }
}
class hashMap{

    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),temp;
        Integer count,val;
        for(int i = 0; i < n; i++){
            temp = sc.nextInt();
            val = Integer.valueOf(temp);
            count = Integer.valueOf(1);
            if(hm.get(val) == null){
                hm.put(val,count);
                st.push(val);
            }
            else{
                count = hm.get(val);
                temp = count.intValue();
                count = Integer.valueOf(temp +1);
                hm.remove(val);
                hm.put(val,count);
            }
            
        }
        Set<Integer> hs = new HashSet<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        tempHs obj[] = new tempHs[hm.size()];
            hs = hm.keySet();
            Iterator itMap = hs.iterator();

        for(int i=0; i< hm.size();i++){
            val = st.pop();
            obj[i] = new tempHs();
            obj[i].key = val;
            obj[i].val = hm.get(val);            
        }
        Arrays.sort(obj,new hmAscend());
        
        for(tempHs t: obj){
            System.out.print(t.key+"\t");
        }

    }
}