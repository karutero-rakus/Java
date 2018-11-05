import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_5 {

	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		FileReader in = null;
		FileWriter out = null;
		
		try{
			inputFile = new File("C:\\Users\\Desktop\\test.txt");
			outputFile = new File("C:\\Users\\Desktop\\test.txt");
			in = new FileReader(inputFile);
			out = new FileWriter(outputFile);
			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException occurs");
		}catch(IOException e){
			System.out.println("IOException occurs");
		}finally{
			try{
				if(in != null){
					in.close();
				}
				if(out != null){
					out.close();
				}
			}catch(IOException e){
				System.out.println("close fail");
				e.printStackTrace();
			}
		}
	}
}
