import java.io.Console;

public class Sample11_9 {

	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine("%s","name：");
		
		System.out.println("You are "+name);
		char[] pw = console.readPassword("%s","pw：");
		System.out.println("Your password：");
		for(char c : pw)
			System.out.println(c);
	}
}
