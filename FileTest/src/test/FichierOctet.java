package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FichierOctet {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream is = new FileInputStream("src\\Flots.java");
			FileOutputStream os = new FileOutputStream("Flots.txt");
			 byte b;
			 
			while((b = (byte) is.read()) != -1)
				os.write(b);
			is.close();
			os.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
