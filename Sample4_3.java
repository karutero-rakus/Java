import java.util.ArrayList;

public class Sample4_3{
	public static void main(String[] args){
		ArrayList<String> array = new ArrayList<String>(3); //�z��̐錾
		
		array.add("�c��"); //�l�̒ǉ�
		array.add("���");
		array.add("����");
		
		System.out.println(array.get(1)); //�l�̎��o��
	}
}