public class Sample2_6{
	public static void main(String[] args){
		String str1 = "���C�I��"; //�����l
		String str2 = "�y���M��"; //�����l
		
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		
		System.out.println(); //���s
		
		str2 = str1;
		System.out.println("str2 = str1; ���s���܂����B");
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		
		System.out.println(); //���s
		
		str1 = "�]�E";
		System.out.println("str1�̕������ύX���܂����B");
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
	}
}