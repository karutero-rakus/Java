//コンストラクタのオーバーロード
class Car3{
	private String color = "決まっていません";
	private int number = 0;
	
	public Car3(){ //コンストラクタ
	}
	public Car3(String c){ //コンストラクタ
		color = c;
	}
	public Car3(String c,int n){ //コンストラクタ
		color = c;
		number = n;
	}
	public void show(){
		System.out.println("色は["+color+"]ナンバーは["+number+"]です。");
	}
}

public class Sample6_3 {
	public static void main(String[] args) {
		Car3 car1 = new Car3();//インスタンス化
		Car3 car2 = new Car3("red"); //インスタンス化
		Car3 car3 = new Car3("green",1234); //インスタンス化
		
		car1.show();
		car2.show();
		car3.show();
	}
}
