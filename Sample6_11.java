interface MyInterface{ //スーパーインターフェース
	int a = 10;
	public void getComment();
}

interface SubInterface extends MyInterface{ //サブインターフェース
	int getSum();
}
//サブインターフェースを実装するとスーパーインターフェースも実装される
class C implements SubInterface{
	public void getComment(){
		System.out.println("スーパーインターフェースを実装する");
	}
	public int getSum(){
		return (a + 5);
	}
}

public class Sample6_11 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.getComment(); //スーパーインターフェース実装
		System.out.println(c1.getSum()); //サブインターフェース実装
	}
}
