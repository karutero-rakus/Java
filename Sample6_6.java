class StaffSp{
	private String name = "名無し";
	String getName(){
		return name;
	}
}

class ManagerSp extends StaffSp{
	int salary = 5000000;
	int getSalary(){
		return salary;
	}
	String getName(){ //オーバーライド
		return "【マネージャー】"+super.getName(); //スーパークラスで定義したメソッドの呼び出し+
	}
}

class Sample6_6 {
	public static void main(String[] args) {
		StaffSp s1 = new StaffSp();
		System.out.println("----------スーパークラス------------");
		System.out.println("名前："+s1.getName());
		System.out.println();
		ManagerSp m1 = new ManagerSp();
		System.out.println("----------サブクラス------------");
		System.out.println("名前："+m1.getName()); //サブクラスで定義したメソッド
		System.out.println("給与："+m1.getSalary());
	}
}
