class Trainer{
	String name;
	Trainer(){ //�R���X�g���N�^�̒�`
		name = "������";
	}
	Trainer(String n){
		name = n;
	}
}

class Sample5_7{
	public static void main(String[] args){
		//�������I�u�W�F�N�g���C���X�^���X��
		Trainer s1 = new Trainer();
		
		//�c������I�u�W�F�N�g���C���X�^���X��
		Trainer s2 = new Trainer("�c������");
		
		//���O��\��
		System.out.println("���O : "+s1.name);
		System.out.println("���O : "+s2.name);
	}
}
