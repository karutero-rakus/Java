public class Sample3_1{
	public static void main(String[] args){
		int a = 5;
		int b = 5;
		
		System.out.println("[&]�̏ꍇ");
		boolean b1 = a++ < 5 & b++ < 5;
		System.out.println("b1 = "+b1+", a = "+a+", b = "+b);
		
		System.out.println("[&&]�̏ꍇ");
		b1 = a++ < 5 && b++ < 5;
		System.out.println("b1 = "+b1+", a = "+a+", b = "+b);
	}
}
