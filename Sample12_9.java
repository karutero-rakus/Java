import java.util.HashSet;
import java.util.TreeSet;

public class Sample12_9 {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>(); //hashsetは順不同に格納される
		hash.add("C");
		hash.add("B");
		hash.add("D");
		System.out.println("HashSet："+hash);
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("C");
		tree.add("B");
		tree.add("D");
		System.out.println("TreeSet："+tree);
	}
}
