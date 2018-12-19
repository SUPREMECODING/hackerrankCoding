import java.util.Scanner;
import java.util.Stack;

class JavaStack{

    static boolean isBalanced(String str){
        Stack<String> st = new Stack<String>();
        char[] chStr = str.toCharArray();
        String s;
        boolean flag = true;
        for(int i = 0; i< chStr.length;i++){
            if(chStr[i]=='{'||chStr[i]=='('||chStr[i]=='[')
                st.push(Character.toString(chStr[i]));
            else{
                if(st.empty()){
                    return false;
                }
                s = st.pop();
                switch(chStr[i]){
                    case ')': 
                    if(!s.equals("("))
                        flag = false;
                    break;
                    case '}': 
                    if(!s.equals("{"))
                        flag = false;
                    break;
                    case ']': 
                    if(!s.equals("["))
                        flag = false;
                    break;

                }
            }
        }
        if(!st.empty())
            flag = false;
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while(sc.hasNext()){
            
            String str = sc.next();
            System.out.println(isBalanced(str));
        //}
    }
}
// ({}[])
// (({()})))
// ({(){}()})()({(){}()})(){()}
// {}()))(()()({}}{}
// }}}}
// ))))
// {{{
// (((
// []{}(){()}((())){{{}}}{()()}{{}{}}
// [[]][][]
// }{