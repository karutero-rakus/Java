import java.time.LocalDateTime;

public class Sample9_3 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2016,10,31,12,34,56,78);
		System.out.println("datetime                : "+dateTime);
		System.out.println("dateTime.plusHours(10)  : "+dateTime.plusHours(10));
		
		System.out.println("dateTime.plusYears(1)   : "+ dateTime.plusYears(1));
		System.out.println("dateTime                : "+dateTime);
		
		System.out.println("------------------------------------");
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("現在の日付/時刻         : "+now);
		System.out.println("now.equals(now.withNano(0)) : "+now.equals(now.withNano(0)));
	}

}
