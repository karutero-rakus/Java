public class Sample5_6{
	static int x = 2;
	public static void main(String[] args){
		add();
		scopeSample();
	}
	
	static void add(){
		int y = 5;
		System.out.println(x+y);
	}
	
	static void scopeSample(){
		for(int i = 0; i < x; i++){
			System.out.println(i);
			//System.out.println(y);
		}
	}
}
