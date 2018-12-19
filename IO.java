import java.io.*;
import java.util.*;

class IO{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = new String();
    //str = br.readLine();
    str = "help me please";
    StringTokenizer st = new StringTokenizer(str," ");
    String arr[];
    arr = str.split(" ");

    char chArr[] = new char[str.length()];
    str.getChars(0,4,chArr,0);

    StringBuffer sb = new StringBuffer(str);

    System.out.println(st.countTokens());
    System.out.println(chArr);
    System.out.println(sb.substring(0,4)+"--");
  }
}
