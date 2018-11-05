package jp.ssie.ocjp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_6 {

	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		BufferedReader in = null;
		BufferedWriter out = null;

		try{
			inputFile = new File("C:\\Users\\Desktop\\test.txt");
			outputFile = new File("C:\\Users\\Desktop\\test.txt");
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));
			String line;

			while((line = in.readLine()) != null){
				out.write(line);
				out.newLine(); //改行
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
