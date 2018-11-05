public class Sample8_3 {

	public static void main(String[] args) {
		LocalOuter outer = new LocalOuter();
		outer.method("param1","param2");
	}
}

class LocalOuter{
	private String outerVal = "outerVal";
	public void method(final String param1, String param2){
		final int x = 10;
		int y = 20;
		int z = 10;
		//ローカルクラスの定義 (メソッド内でのみ有効)
		class LocalInner{ //修飾子をつけられずstaticにすることもできない
			void method(){
				System.out.println("outerVal : "+outerVal);
				System.out.println("x        : "+x);
				System.out.println("y        : "+y);
				
				System.out.println("param1   : "+param1);
				System.out.println("param2   : "+param2);
			}
		}
		LocalInner inner = new LocalInner();
		inner.method();
		outerVal = "hello";
		//y = 10; //これはコンパイルエラー
		//param2 = "hello"; //25行目でエラーがでる
		z = 20;
		System.out.println(z);
	}
}
