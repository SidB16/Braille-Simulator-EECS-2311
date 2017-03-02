package tts;
/*package basiccoding_tts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static String[] readArrayOfFile(String filename) {
		ArrayList<String> lt = new ArrayList<String>();

		try {
			Scanner x = new Scanner(new File(filename));
			while (x.hasNextLine()) {

				lt.add(x.nextLine());

			}
			x.close();
		} catch (FileNotFoundException e) {
			// System.out.println("file could not be read");
			e.printStackTrace();
		}

		String[] strDays = {};
		strDays = lt.toArray(strDays);
		return strDays;
	}

	public static void main(String[] args) {

		Voice voice = new Voice("kevin16");
		String[] sayMe = readArrayOfFile("h.txt");
		voice.sayMutiple(sayMe);
	}

}*/