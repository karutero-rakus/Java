class Super{
	void print(){
		System.out.println("Super");
	}
}

class Sub extends Super{
	void print(){
		System.out.println("Sub");
	}
}

class Foo<T extends Super>{
	private T val;
	
	public Foo(T val){
		this.val = val;
	}
	public void call(){val.print();}
}

class Sample12_8 {
	public static void main(String[] args) {
		Super obj1 = new Super();
		Sub obj2 = new Sub();
		Foo<Super> foo1 = new Foo<Super>(obj1);
		foo1.call();
		Foo<Super> foo2 = new Foo<Super>(obj2);
		foo2.call();
	}
}
