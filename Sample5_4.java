class MetTest{
	static void metTest1(){
		System.out.println("staticメソッドが呼ばれました。");
	}
	void metTest2(){
		System.out.println("インスタンスメソッドが呼ばれました。");
	}
	
}

public class Sample5_4{
	public static void main(String[] args){
		MetTest.metTest1(); //クラス名.Staticメソッド
		//MetTest.metTest2(); //staticメソッドでないので不可
		System.out.println();
		MetTest mt = new MetTest(); //インスタンス化
		mt.metTest1(); //staticメソッドはこの呼び出しでも可
		mt.metTest2(); //参照変数名.メソッド名
	}
}