public class Sample3_7{
	public static void main(String[] args){
		int cnt = 1;
		int sum = 0;
		while(cnt <= 10){
			sum += cnt;
			System.out.println("sum �� "+sum+"  cnt ��"+cnt);
			cnt++;
		}
		System.out.println("1����10�܂ł̑��a��"+sum+"�ł��B");
	}
}