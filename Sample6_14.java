abstract class School{ //抽象クラス
	String name;
	abstract void getName(); //抽象メソッド
	void setName(String n){
		name = n;
	}
}

class Students extends School{
	void getName(){ //抽象メソッドをオーバーライド
		System.out.println("名前 :"+name);
	}
}

public class Sample6_14 {
	public static void main(String[] args) {
		School s1 = new Students(); //インスタンス化
		s1.setName("山田");
		s1.getName();
	}
}
