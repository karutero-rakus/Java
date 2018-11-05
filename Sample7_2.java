public class Sample7_2 {

	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try{
			System.out.println("x / y:"+x/y);//ArithmeticExceptionが発生
			System.out.println("2 * y:"+x*y); //この処理は実行されない
		}catch(ArithmeticException ae){
			System.out.println("発生した例外："+ae);
		}finally{
			System.out.println("finallyブロック。必ず実行される");
		}
		System.out.println("x - y:"+(x-y));//try-catch範囲外なので実行される
	}
}
