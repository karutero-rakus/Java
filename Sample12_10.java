import java.util.PriorityQueue;
import java.util.Queue;

public class Sample12_10 {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("C");
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("E");
		pq.add("D");
		System.out.println(pq); //ソートされて表示
		System.out.print(pq.poll()); //取得および削除
		System.out.println(pq); //Aがなくなる
		System.out.print(pq.poll()); //取得および削除
		System.out.println(pq); //Bがなくなる
		System.out.print(pq.peek()); //取得のみ
		System.out.println(pq);
	}
}
