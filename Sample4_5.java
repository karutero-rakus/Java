import java.util.*;

public class Sample4_5{
	public static void main(String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		String st1= "ready";
		String st2= "set";
		String st3= "go";
		//Integer i = 123;
		myList.add(st1);
		myList.add(st2);
		myList.add(st3);
		//myList.add(i); //�R���p�C���G���[
		
		//�ʏ�for��
		for(int i = 0; i < myList.size(); i++){
			String st = (String) myList.get(i);
			System.out.println(st);
		}
		
		/*�g��for��
		for(String st : myList){
			System.out.println(st);
		}*/
		
		/*Iterator���g�p�������o��
		String st = null;
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			st = itr.next();
			System.out.println(st);
		}
		*/
	}
}