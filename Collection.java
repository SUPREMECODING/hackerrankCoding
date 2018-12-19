import java.util.*;

class Collection{
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		Stack<Integer> st= new Stack<Integer>();
		

		hs.add("ahello");
		hs.add("bvivek");
		hs.add("cVivek");

		st.push(Integer.valueOf(100));
		st.push(Integer.valueOf(105));

		System.out.println("Stack set -"+ st);

		Iterator it= st.iterator();

		System.out.println(it.next());
	}
}