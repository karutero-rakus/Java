public class Sample2_11{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		//文字追加
		System.out.println(sb.append("きつね"));
		//位置を指定して追加
		System.out.println(sb.insert(0,"きた"));
		//逆に並び替える
		System.out.println(sb.reverse());
		//4文字目以上5文字目未満の文字を削除する
		System.out.println(sb.delete(3,5));
		//2文字目以上3文字目未満の間の文字を"ま"に変換する
		System.out.println(sb.replace(1,2,"ま"));
		//0文字以上2文字未満の文字を取り出す
		System.out.println(sb.substring(0,2));
		//0番目の文字から取り出す
		System.out.println(sb.substring(0));
	}
}