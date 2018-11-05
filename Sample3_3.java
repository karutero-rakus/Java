public class Sample3_3{
	public static void main(String[] args){
		//xに85を代入する
		int x = 85;
		//xが100と等しい場合
		if(x == 100){
			System.out.println("満点です！");
		//xが80以上の場合
		}else if(x >= 80){
			System.out.println("合格です。");
		//xが80未満かつ60以上の場合
		}else if(x < 80 && x >= 60){
			System.out.println("がんばりました。");
			//上記の条件がどれもtrueにならなかった場合（59以下）
		}else{
			System.out.println("もっとがんばりましょう。");
		}
	}
}