class TestClass{
	static int count = 0;
	static { //このクラスが初めて呼び出されたときに一度だけ処理される
		count++;
		System.out.println("count : "+count);
	}//-------------------------------------------------------------
	int num;
	public TestClass(int i){
		num = i;
	}
	void getNumber(){
		System.out.println(num);
	}
}
public class Sample5_9{
	public static void main(String[] args){
		TestClass[] tc1 = {
			new TestClass(10),
			new TestClass(20),
			new TestClass(30),
			new TestClass(40),
		};
		for(TestClass tc2 : tc1){
			tc2.getNumber();
		}
	}
}