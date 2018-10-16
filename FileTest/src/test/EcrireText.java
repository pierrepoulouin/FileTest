package test;

import java.io.FileWriter;
import java.io.IOException;

public class EcrireText {

	public static void main(String[] args) {
		
		try {
			FileWriter fw =new FileWriter("Monfic.txt");
			fw.write("Bonjour toi !");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
