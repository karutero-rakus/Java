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
		s1.setName("佐藤さん");
		
		Teacher s2 = new Teacher();
		s2.setName("田中さん");
		
		//名前の表示
		System.out.println("名前 : "+s1.getName());
		System.out.println("名前 : "+s2.getName());
	}
}