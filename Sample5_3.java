class Teacher{
	String name;
	
	void setName(String x){
		name = x;
	}
	
	String getName(){
		return name;
	}
}

class Sample5_3{
	public static void main(String[] args){
		Teacher s1 = new Teacher();
		s1.setName("��������");
		
		Teacher s2 = new Teacher();
		s2.setName("�c������");
		
		//���O�̕\��
		System.out.println("���O : "+s1.getName());
		System.out.println("���O : "+s2.getName());
	}
}