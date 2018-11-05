import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Sample7_5{
	//オーバーライド対象メソッド
	//IOExceptionをthrowしていることに注意する
	public void someMethod() throws IOException{}
}

class Sample7_5_1 extends Sample7_5{
	//スーパークラスと同じIOExceptionをthrowしているのでok
	public void someMethod() throws IOException{}
}

class Sample7_5_2 extends Sample7_5{
	//throwsをしていないのでok
	public void someMethod() {}
}

class Sample7_5_3 extends Sample7_5{
	public void someMethod() throws EOFException,FileNotFoundException{}
}

class Sample7_5_4 extends Sample7_5{
	//ClassNotFoundExceptionはIOExceptionと
	//継承関係がないためNG
	//public void someMethod() throws ClassNotFoundException{}
}

class Sample7_5_5 extends Sample7_5{
	//ExceptionはIOExceptionと継承関係がないためNG
	//public void someMethod() throws Exception{}
}

class Sample7_5_6 extends Sample7_5{
	//ClassNotFoundExceptionはIOExceptionと継承関係がないためNG
	//public void someMethod() throws IOException,ClassNotFoundException{}
}

class Sample7_5_7 extends Sample7_5{
	//実行時例外は許可
	public void someMethod() throws RuntimeException{}
}