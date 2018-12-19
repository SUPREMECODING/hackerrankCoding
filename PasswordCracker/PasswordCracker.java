import java.util.*;

class PasswordCracker{
    static String PwList[];
    static int PwScanned[];
    static String LgAttmpt;
    static int MAX;
    static String result = "";
    static boolean found = false;

    static void PC(int index,String res){
        if(index == MAX){
            setResult(res);
            return;
        }
        
        for(int i = 0; i < PwList.length && index < MAX; i++){
            if(PwScanned[i] == 0 && LgAttmpt.indexOf(PwList[i],index)==index){                
                PwScanned[i] = 1;
                PC(index,res);
                PwScanned[i] = 0;
                res += PwList[i] + " ";
                PC(index + PwList[i].length(),res);                
            }
        }
        
    }
    static void setResult(String r){
        found = true;
        result = r;
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            PwScanned = new int[n];
            String[] pass = new String[n];
            for(int pass_i = 0; pass_i < n; pass_i++){
                pass[pass_i] = in.next();
            }
            PwList = pass;
            String attempt = in.next();
            LgAttmpt = attempt;
            MAX = attempt.length();
            PC(0,new String());
            if(found)   System.out.println(result.trim());
            else    System.out.println("WRONG PASSWORD");
            found = false;
            result = "";
        }
        in.close();        
    }
}