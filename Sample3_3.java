public class Sample3_3{
	public static void main(String[] args){
		//x��85��������
		int x = 85;
		//x��100�Ɠ������ꍇ
		if(x == 100){
			System.out.println("���_�ł��I");
		//x��80�ȏ�̏ꍇ
		}else if(x >= 80){
			System.out.println("���i�ł��B");
		//x��80��������60�ȏ�̏ꍇ
		}else if(x < 80 && x >= 60){
			System.out.println("����΂�܂����B");
			//��L�̏������ǂ��true�ɂȂ�Ȃ������ꍇ�i59�ȉ��j
		}else{
			System.out.println("�����Ƃ���΂�܂��傤�B");
		}
	}
}