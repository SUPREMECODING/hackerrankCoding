import java.util.*;

class DisjointSet{
    int parent[];
    DisjointSet(int N){         //for initialize
        parent = new int[N];
        Arrays.fill(parent,-1);
    }
    int find(int i){
        if(parent[i] == -1)
            return i;
        return find(parent[i]);
    }
    void union(int index_1,int index_2){
        int in1P1 = this.find(index_1); // parent index of index_1
        int in2P2 = this.find(index_2);

        // in2P2(in1P1)--->in1P1(-1)
        this.parent[in2P2] = in1P1;
        in1P1 = -1;
    }
    void print(){
        for(int i : this.parent)
            System.out.print(i + " ");
    }
    public static void main(String[] args) {
        // Suppose there are 4 items
        
        DisjointSet ds = new DisjointSet(4);
        ds.union(0,2);      // means 2 and 0 belongs to same set
        ds.union(3,0);      // means now 3 is the parent of 0 and representative
        ds.print();
        System.out.println();
    }
}