package player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import simulator.Simulator;
import tts.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is included as an example of how to use the classes in the simulator package.
 * 
 */

//start of ttsreader
public class ToyPlayer { 
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
		Simulator sim = new Simulator(5, 3); //braille gets initiaed ??

		sim.displayString("dog");
		
		sim.getCell(3).displayCharacter('z');
		sim.getCell(4).raiseOnePin(3);
		
		Voice voice = new Voice("kevin16"); //voice reader is initialied
		String[] sayMe = readArrayOfFile("t.txt");
		voice.sayMutiple(sayMe);
		
		//actionlistner for button 
		sim.getButton(0).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Button 0 got pressed.");

			}

		});
		sim.getButton(1).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(null, "Button 1 got pressed.");

			}

		});
		sim.getButton(2).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg2) {
				JOptionPane.showMessageDialog(null, "Button 2 got pressed.");

			}

		});

	}

}
