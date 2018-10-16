package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LireFichier {

	public static void main(String[] args) throws IOException {
		File l = new File("Monfic.txt");
		FileReader fr;
		try {
			fr = new FileReader(l);
			BufferedReader br = new BufferedReader(fr);
			
			String ligne = null;
			
			while((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
