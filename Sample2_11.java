public class Sample2_11{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		//�����ǉ�
		System.out.println(sb.append("����"));
		//�ʒu���w�肵�Ēǉ�
		System.out.println(sb.insert(0,"����"));
		//�t�ɕ��ёւ���
		System.out.println(sb.reverse());
		//4�����ڈȏ�5�����ږ����̕������폜����
		System.out.println(sb.delete(3,5));
		//2�����ڈȏ�3�����ږ����̊Ԃ̕�����"��"�ɕϊ�����
		System.out.println(sb.replace(1,2,"��"));
		//0�����ȏ�2���������̕��������o��
		System.out.println(sb.substring(0,2));
		//0�Ԗڂ̕���������o��
		System.out.println(sb.substring(0));
	}
}