public class Sample4_1{
	public static void main(String[] args){
		int[] iar = new int[5]; //�z���錾
		//int[] iar = new int �����l����͂��Ă��������A�ƃG���[�ɂȂ�
		
		iar[0] = 12;  //�z��̏�����
		iar[1] = 3;   //�قȂ�f�[�^�^�̑���́A�R���p�C���G���[�ɂȂ�܂��B
		iar[2] = 28;  //iar[2] = 2.25
		iar[3] = 427; //�m�ۂ����̈�O�ւ̑���́A���s���G���[�ɂȂ�܂�
		iar[4] = 33;  //iar[5] = 15;
		
		System.out.println("iar[0]�̒l�� "+iar[0]+" �ł��B"); //�\��
		System.out.println("iar[1]�̒l�� "+iar[1]+" �ł��B");
		System.out.println("iar[2]�̒l�� "+iar[2]+" �ł��B");
		
		String[] sar = {"One","Two","Three"}; //�z��̐錾�Ə�����
		
		System.out.println("sar[0]�̒l�� "+sar[0]+" �ł��B"); //�\��
		System.out.println("sar[1]�̒l�� "+sar[1]+" �ł��B");
		System.out.println("sar[2]�̒l�� "+sar[2]+" �ł��B");
		
		int len = sar.length; //�z��̗v�f�����擾
		System.out.println("�z��sar�̗v�f�̐��� "+len+" �ł��B"); //�\��
	}
}