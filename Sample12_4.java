import java.util.ArrayList;
import java.util.List;

public class Sample12_4 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Object obj2 = new Object();
		obj2 = obj1; //ok
		
		List<Integer> obj3 = new ArrayList<Integer>();
		List<Object> obj4 = new ArrayList<Object>();
		//obj4 = obj3; //error
	}
}
