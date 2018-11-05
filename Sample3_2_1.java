public class Sample3_2_1{
	public static void main(String[] args){
		String singo = "青";
		
		if(singo.equals("赤")){
			System.out.println("信号が赤なので止まってください。");
		}else{
			System.out.println("信号が赤ではないので進んでください。");
		}
	}
}