public class Sample5_10{
	public static void main(String[] args){
		//��new�ɂ��C���X�^���X���͂ł��Ȃ�
		//Runtime rt = new Runtime();
		Runtime rt =Runtime.getRuntime();
		System.out.println("JVM free memory before running gc:"+rt.freeMemory());
		rt.gc(); //�K�x�[�W�R���N�^�̎��s�𑣂�
		System.out.println("JVM free memory after running gc:"+rt.freeMemory());
	}
}


//rt.freeMemory(); JVM�̋󂫃������e�ʂ�߂�
//rt.totalMemory(); JVM�Ɋ��蓖�Ă�ꂽ���v�������e�ʂ�߂�
