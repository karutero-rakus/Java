abstract class Car{ //抽象クラス
	Car(){ //コンストラクタは使用できます。
		System.out.println("自動車を作成します");
	}
	abstract public String setLight(); //抽象メソッド
}

class CarA extends Car{ //抽象クラスを継承したサブクラス(A社)
	CarA(){
		System.out.println("A社のパーツを使います。");
	}
	public String setLight(){ //オーバーライド
		return "丸ライト";
	}
}

class CarB extends Car{ //抽象クラスを継承したサブクラス
	CarB(){
		System.out.println("B社のパーツを使います。");
	}
	public String setLight(){ //オーバーライド
		return "四角ライト";
	}
}

class Sample6_10 {
	public static void main(String[] args) {
		Car a1 = new CarA(); //インスタンス化できるのはサブクラス
		System.out.println("ライトは"+a1.setLight()+"を取り付けました");
		
		System.out.println();
		
		Car b1 = new CarB();
		System.out.println("ライトは"+b1.setLight()+"を取り付けました");
	}
}
