package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLexample {

	public static void main(String[] args) {

		try {
			URL webURL = new URL("https://www.sample-videos.com/text/Sample-text-file-10kb.txt");
			BufferedReader line = new BufferedReader(new InputStreamReader(webURL.openStream()));
			String ligne = line.readLine();
			
			System.out.println(ligne);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}


	}

}
