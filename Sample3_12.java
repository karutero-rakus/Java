public class Sample3_12{
	public static void main(String[] args){
		label1: for(int i = 1; i < 10; i++){
			for(int j = 1; j < 10; j++){
				if(i * j > 20){
					break label1; //iのループを終了します
				}
				if(i == 1){
					break; //jのループを抜けて、iの次のループが始まる
				}
				if(j % 2 == 1){
					continue; //jの次のループが始まります。
				}
				System.out.println(i * j);
			}
		}
	}
}