import java.time.LocalTime;

public class Sample9_2 {

	public static void main(String[] args) {
		//LocalTimeクラスはnewを利用して直接インスタンス化することができない
		//LocalTime time = new LocalTime(12,34,56,78); //コンパイルエラー
		
		//LocalTime.ofメソッドを利用して指定した時刻を保持するインスタンスを取得
		LocalTime time = LocalTime.of(12,34,56,78);
		
		System.out.println("time               : "+time);
		System.out.println("time.plusHours(10) : "+time.plusHours(10));
		
		System.out.println("time               : "+time);
		
		System.out.println("---------------------------");
		
		LocalTime now = LocalTime.now();
		System.out.println("現在時刻           : "+now);
		LocalTime afterOneHour = now.plusHours(1);
		System.out.println("1時間後の時刻      : "+afterOneHour);
		
		LocalTime nano0 = now.withNano(0);
		System.out.println("現在時刻           : "+nano0);
		
		System.out.println("now.equals(nano0)  : "+now.equals(nano0));
		System.out.println("now.withNano(0).equals(nano0) : "+now.withNano(0).equals(nano0));

	}

}
