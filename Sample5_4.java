class MetTest{
	static void metTest1(){
		System.out.println("static���\�b�h���Ă΂�܂����B");
	}
	void metTest2(){
		System.out.println("�C���X�^���X���\�b�h���Ă΂�܂����B");
	}
	
}

public class Sample5_4{
	public static void main(String[] args){
		MetTest.metTest1(); //�N���X��.Static���\�b�h
		//MetTest.metTest2(); //static���\�b�h�łȂ��̂ŕs��
		System.out.println();
		MetTest mt = new MetTest(); //�C���X�^���X��
		mt.metTest1(); //static���\�b�h�͂��̌Ăяo���ł���
		mt.metTest2(); //�Q�ƕϐ���.���\�b�h��
	}
}