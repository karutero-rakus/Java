class RefTest{
	void metTest1(int num){
		num += 30;
		System.out.println("int�^��`���� "+num);
	}
	void metTest2(int[] array){
		array[0] += 30;
		System.out.println("�z���`�� "+array[0]);
	}
	void metTest3(String str){
		str += "30";
		System.out.println("String�^��`�� "+str);
	}
}

public class Sample5_11{
	public static void main(String[] args){
		int num = 20;
		int[] array = {20,40}; //�z��I�u�W�F�N�g�Q�ƌ^
		String str = "20"; //String�^���Q�ƌ^
		RefTest obj = new RefTest();
		
		obj.metTest1(num);
		System.out.println("int�^�Ăяo������ "+num);
		obj.metTest2(array);
		System.out.println("�z��Ăяo������ "+array[0]);
		obj.metTest3(str);
		System.out.println("String�^�Ăяo������ "+str);
	}
}