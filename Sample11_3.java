import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3 {

	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		FileInputStream in = null;
		FileOutputStream out = null;

		try{
			inputFile = new File("C:\\Users\\Desktop\\test.txt");
			outputFile = new File("C:\\Users\\Desktop\\test.txt");
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException occurs");
		}catch(IOException  e){
			System.out.println("IOException occurs");
		}finally{
			try{
				if(in != null){
					in.close();
				}
				if(out != null){
					in.close();
				}
			}catch(IOException e){
				System.out.println("close fail");
				e.printStackTrace();
			}
		}
	}
}
