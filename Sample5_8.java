class Car2{
	String color;
	int num;
	double gas;
	public Car2(String c,int n,double g){
		color = c;
		num = n;
		gas = g;
	}
	
	public void show(){
		System.out.println("�Ԃ̐F�� "+color+" �i���o�[�� ["+num+"] �R���� ["+gas+"] ");
	}
}

public class Sample5_8{
	public static void main(String[] args){
		Car2[] cars = { //�C���X�^���X��
						new Car2("red",100,20.5),
						new Car2("blue",200,30.5),
						new Car2("green",300,40.5)
		};
		for(Car2 car : cars){
			car.show();
		}
	}
}