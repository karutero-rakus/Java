public class Sample2_10{
	public static void main(String[] args){
		String str = "����";
		
		System.out.println(str.charAt(0)); //1���������o��
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		System.out.println(str.indexOf("��")); //�����̈ʒu
		System.out.println("�������H>>>> "+ str.length()); //������
		System.out.println(str.toString()); //str���Q�Ƃ��Ă��镶��
	}
}
