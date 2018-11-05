public class Sample6_12 {

	public static void main(String[] args) {
		int i = 5;
		double d = 2.5;
		
		System.out.print("int → double : ");
		double id = i;
		System.out.println(id);
		
		System.out.println("double → char : ");
		//char dc = d; //暗黙敵変換では不可能なため、コンパイルエラーとなる
		//System.out.println(dc);
	}
}
