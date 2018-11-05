import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_4 {

	public static void main(String[] args) {
		String dataFile = "C:\\Userst\\Desktop\\test.txt";
		double grandTotal = 0.0;
		//ファイルに書き出す
		try{
			double[] priceList = {19.99,29.99,39.99};
			int[] copies = {100000,50000,70000};
			String[] titleList = {"SCJ-P Study Guide","SJC-BC Student Guide","SCSA Student Guide"};
			DataOutputStream out = new DataOutputStream(new FileOutputStream(dataFile));
			for(int i = 0; i < priceList.length; i++){
				out.writeDouble(priceList[i]);
				out.writeChar('\t');
				out.writeInt(copies[i]);
				out.writeChar('\t');
				out.writeChars(titleList[i]);
				out.writeChar('\n');
			}
			out.close();
		}catch(IOException e){
			System.out.println("IOException occurs");
		}

		//再度読み込み
		DataInputStream in = null;
		try{
			double price = 0.0;
			int copy=0;
			StringBuffer title = null;
			in = new DataInputStream(new FileInputStream(dataFile));
			while(true){
				price = in.readDouble();
				in.readChar(); //タブは読みとばす
				copy = in.readInt();
				in.readChar();
				char ch;
				title = new StringBuffer(25);
				char lineSep = System.getProperty("line.separator").charAt(1);
				while((ch = in.readChar()) != lineSep){
					title.append(ch);
				}
				System.out.println("Your order:"+copy+"copies of"+title+"at $"+price);
				grandTotal = grandTotal + copy * price;
			}
		}catch(EOFException e){
			System.out.println("End of File!");
		}catch(IOException e){
			System.out.println("IOException ocurs");
		}
		System.out.println("Grand Total: $"+grandTotal);
		try{
			in.close();
		}catch(IOException e){
		}
	}
}
