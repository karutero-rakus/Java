public class Sample12_14 {

	public static void main(String[] args) {
		Integer wi1 = 300;
		Integer wi2 = 300;
		
		int i = 300;
		if(wi1 == 300) System.out.println("wi1 == 300");
		if(wi1 == wi2) System.out.println("wi1 == wi2"); //ここだけ実行されない(wi1とwi2は==ではないため)
		if(wi1 == i) System.out.println("wi1 == i");
		if(wi2 == i) System.out.println("wi2 == i");
		
		
		if(wi1.equals(300))System.out.println("wi1.equals(300)");
		if(wi1.equals(wi2))System.out.println("wi1.equals(wi2)");
		if(wi1.equals(i))System.out.println("wi1.equals(i)");
		if(wi2.equals(i))System.out.println("wi2.equals(i)");
	}
}
