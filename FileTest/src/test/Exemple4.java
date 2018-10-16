package test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemple4 {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fos = new FileOutputStream("MonZoo.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Object monChien = "Milou";
		Object monCanard = "Hubert";
		oos.writeObject(monChien);
		oos.writeObject(monCanard);
		
		oos.close();

	}

}
