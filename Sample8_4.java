public class Sample8_4 {

	public static void main(String[] args) {
		//外部クラスのオブジェクト生成
		AnonymityOuter outer = new AnonymityOuter();
		
		//外部クラスメソッドから匿名クラスのオブジェクト生成
		System.out.println("Create the Inner class object");
		outer.makeTheInner();
	}
}

class AnonymitySuper{
	private int i = 0;
	public void display(){
		System.out.println("This is MySuper Class");
		System.out.println("i = "+ i);
	}
}

//外部クラス
class AnonymityOuter{
	private int size = 5;
	
	public void makeTheInner(){ 
		//ローカル変数
		String str = "local variable";
		final String finalStr = "final variable.";
		
		
		//AnonymitySuperをスーパークラスとした
		//匿名クラスを定義
		(new AnonymitySuper(){
			//匿名クラスのメソッド定義
			//AnonymitySuperクラスのメソッドのオーバーライド
			public void display(){
				System.out.println("This is Anonymous Class.");
				System.out.println("finalStr : "+finalStr);
				System.out.println("size     : "+size);
				//以下はfinal指定ではないが、変数strの値が変更されていないため実行可能(JDK 8)
				System.out.println("str : "+str);
			}
			
		}).display();//匿名クラス内のメソッド呼び出し
	}
}