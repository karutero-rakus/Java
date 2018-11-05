public class Sample4_1{
	public static void main(String[] args){
		int[] iar = new int[5]; //配列を宣言
		//int[] iar = new int 初期値を入力してください、とエラーになる
		
		iar[0] = 12;  //配列の初期化
		iar[1] = 3;   //異なるデータ型の代入は、コンパイルエラーになります。
		iar[2] = 28;  //iar[2] = 2.25
		iar[3] = 427; //確保した領域外への代入は、実行時エラーになります
		iar[4] = 33;  //iar[5] = 15;
		
		System.out.println("iar[0]の値は "+iar[0]+" です。"); //表示
		System.out.println("iar[1]の値は "+iar[1]+" です。");
		System.out.println("iar[2]の値は "+iar[2]+" です。");
		
		String[] sar = {"One","Two","Three"}; //配列の宣言と初期化
		
		System.out.println("sar[0]の値は "+sar[0]+" です。"); //表示
		System.out.println("sar[1]の値は "+sar[1]+" です。");
		System.out.println("sar[2]の値は "+sar[2]+" です。");
		
		int len = sar.length; //配列の要素数を取得
		System.out.println("配列sarの要素の数は "+len+" です。"); //表示
	}
}