import java.util.Scanner;

class PasswordCrackerv2 {
    static String pass[];
    static int pwScan[];
    static String pwString="";
    static int MAX;

    static boolean PC(String Login){
        int newIndex,pwIndex;
        String tempRes = retMatchIndex(Login);
        //System.out.println(Login+" = "+tempRes);
        String temp[] = tempRes.split(" ");
        
        newIndex = Integer.parseInt(temp[0]);
        pwIndex = Integer.parseInt(temp[1]);

        if(newIndex == Login.length()){
            pwString += pass[pwIndex]+" ";
            return true;
        }
        if(newIndex == -1)
            return false;
        boolean a = PC(Login);
        pwScan[pwIndex] =0;
        pwString += pass[pwIndex] +" " ;
        
        boolean b = PC(Login.substring(newIndex));
        return a||b;
    }
    static String retMatchIndex(String str){
        int res = -1,i;
        for(i= 0; i< pass.length;i++){
            if(str.startsWith(pass[i])&&pwScan[i] == 0){
                pwScan[i] = 1;
                res = pass[i].length();
                break;
            }
        }
        return res+" "+ i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int t_c = 0; t_c < testCase; t_c++){
            int N = sc.nextInt();        
            pass = new String[N];
            pwScan = new int[N];
            for(int i = 0; i< N; i++){
                pass[i] = new String();
                pass[i] = sc.next();
            }
            String LgAttmpt = sc.next();
            MAX = LgAttmpt.length();
            
            if(PC(LgAttmpt))
                System.out.println(pwString.trim());
            else
                System.out.println("WRONG PASSWORD");
            pwString = "";
        }
        sc.close();
    }
}