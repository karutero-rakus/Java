public class Sample2_6{
	public static void main(String[] args){
		String str1 = "ライオン"; //初期値
		String str2 = "ペンギン"; //初期値
		
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		
		System.out.println(); //改行
		
		str2 = str1;
		System.out.println("str2 = str1; を行いました。");
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		
		System.out.println(); //改行
		
		str1 = "ゾウ";
		System.out.println("str1の文字列を変更しました。");
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
	}
}