import java.util.Arrays;
import java.util.Comparator;

public class Sample12_11 {

	public static void main(String[] args) {
		String[] str = {"Michiko","Satoshi","Chieko"};

		//ソートをしないでbinarySearch()を使用した場合
		System.out.println("ソートなし------");
		for(String s : str) System.out.print(s + " ");
		System.out.println("\nChieko = "+ Arrays.binarySearch(str,"Chieko"));

		//ソートをしてからbinarySearch()を使用した場合
		Arrays.sort(str);
		System.out.println("自然順にソート-----");
		for(String s : str)System.out.print(s+" ");
		System.out.println("\nChieko = "+Arrays.binarySearch(str,"Chieko"));

		//Comparatorを使用した場合
		System.out.println("Comparatorを使用して逆順にソート-----");
		MyReverseSorter ms = new MyReverseSorter();
		
		//sort()メソッドの第2引数にComparator
		//実装クラスのオブジェクトを渡す
		Arrays.sort(str,ms);
		for(String s : str)System.out.print(s+" ");
		
		//渡さなかった場合
		System.out.println("\nChieko = "+Arrays.binarySearch(str,"Chieko"));
		//渡した場合
		System.out.println("Chieko = "+Arrays.binarySearch(str,"Chieko",ms));
	}
}

class MyReverseSorter implements Comparator<String>{
	public int compare(String s1 ,String s2){
		return s2.compareTo(s1);
	}
}
