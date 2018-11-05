public class Sample5_10{
	public static void main(String[] args){
		//↓newによるインスタンス化はできない
		//Runtime rt = new Runtime();
		Runtime rt =Runtime.getRuntime();
		System.out.println("JVM free memory before running gc:"+rt.freeMemory());
		rt.gc(); //ガベージコレクタの実行を促す
		System.out.println("JVM free memory after running gc:"+rt.freeMemory());
	}
}


//rt.freeMemory(); JVMの空きメモリ容量を戻す
//rt.totalMemory(); JVMに割り当てられた合計メモリ容量を戻す
