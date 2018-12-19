import java.util.*;

class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        s1 = new String(ch1);
        
        s2 = new String(ch2);
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("TRUE");
    }
}