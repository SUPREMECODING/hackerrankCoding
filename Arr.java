import java.util.*;

class Ascend implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2){
		return i1.compareTo(i2);
	}
}

class Arr{
	public static void main(String[] args) {
		int arri[] = {10 , 20 , 30 ,40};

		Integer arr[] = new Integer()

		Arrays.sort(arr, new Ascend());
	}
}