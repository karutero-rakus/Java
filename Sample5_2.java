public class Sample5_2{
	public static void main(String[] args){
		
		Dog dog1 = new Dog("������","�Č�");
		Dog dog2 = new Dog("�|�`","�~�j�`���A�_�b�N�X");
		Dog dog3 = new Dog("�܂���","���u���h�[���E���g���[�o�[");
		
		System.out.println("���O��"+dog1.getName()+"�ŁA�����"+dog1.getKensyu()+"�ł��B");
		System.out.println("���O��"+dog2.getName()+"�ŁA�����"+dog2.getKensyu()+"�ł��B");
		System.out.println("���O��"+dog3.getName()+"�ŁA�����"+dog3.getKensyu()+"�ł��B");
		
		//static�ϐ��̓C���X�^���X�����Ȃ��Ă��悢
		System.out.println("�� : "+Dog.count+"�C�ł��B");
	}
}

class Dog{
	static int count;
	String name;
	String kensyu;
	
	public Dog(String n,String k){
		name = n;
		kensyu = k;
		count++;
	}
	String getName(){
		return name;
	}
	String getKensyu(){
		return kensyu;
	}
}