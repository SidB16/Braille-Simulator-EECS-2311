/*package enamel.simulator;


import java.io.*;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SoundPlayer 
{
	private Voice voice;
	private VoiceManager vm;
	private static Scanner fileScanner = null;
	private int cellNum;
	private int buttonNum;
	
	public SoundPlayer() 
	{
		vm = VoiceManager.getInstance(); 
		// Will have to change to allow multiple options of voices
		voice = vm.getVoice("kevin16");
		voice.allocate(); 

	}
	
	public int getCellSize ()
	{
		return cellNum;
	}
	
	public int getButtonSize ()
	{
		return buttonNum;
	}
	
	public void play () throws IllegalStateException
	{
		String fileLine;
		try
		{
			if (fileScanner == null)
			{
				throw new IllegalStateException ("Error! A scenario file has yet to be added! Please run either the"
						+ "startFile or startDir method before calling this one!");
			}
			else
			{
				while (fileScanner.hasNextLine())
				{
					fileLine = fileScanner.nextLine();
					if (fileLine.length () >= 6 && fileLine.substring(0, 6).equals("/~Mus:"))
					{
						playSound (fileLine.substring(6));
					}
					else
					{
						voice.speak(fileLine);
					}
				}
				if (!fileScanner.hasNextLine())
				{
					fileScanner.close ();
				}
			}
		}
		catch (Exception e)
		{
			
		}
	}
	
	private void playSound (String sound)
	{
	    try
	    {
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\" + sound)));
	        clip.start();

	        while (!clip.isRunning())
	            Thread.sleep(10);
	        while (clip.isRunning())
	            Thread.sleep(10); 
	        clip.close();  

	    }
	    catch (Exception exc)
	    {
	        exc.printStackTrace(System.out);
	    }
	}
	
	private void setCellAndButton () throws NumberFormatException
	{
		try
		{
			cellNum = Integer.parseInt(fileScanner.nextLine().split("\\s")[1]);
			buttonNum = Integer.parseInt(fileScanner.nextLine().split("\\s")[1]);
		}
		catch (NumberFormatException e)
		{
			throw new NumberFormatException ("Error! Please enter a number for the cells and/or buttons!");
		}
	}
	
	
	public void startFile (String fileName) throws IllegalArgumentException
	{
		if (fileScanner == null)
		{
			try
			{
				fileScanner = new Scanner (new File (System.getProperty("user.dir") + "\\" + fileName));
				setCellAndButton ();
			}
			catch (Exception e)
			{
				
			}
		}
		else
		{
			throw new IllegalArgumentException ("Error! A scenario file already exists!");
		}
	}
	
	public void startDir (String scenarioLocation) throws IllegalArgumentException
	{
		if (fileScanner == null)
		{
			try
			{
				fileScanner = new Scanner (new File (scenarioLocation));
				setCellAndButton ();
			}
			catch (Exception e)
			{
				
			}
		}
		else
		{
			throw new IllegalArgumentException ("Error! A scenario file already exists!");
		}
		
	}
	
	
	public static void main (String [] args)
	{
		SoundPlayer soundName = new SoundPlayer ();
//		VoiceManager vm = VoiceManager.getInstance(); 
//		Voice voice = vm.getVoice("kevin16");
//		voice.allocate(); 
		try
		{
			Scanner fileScan = new Scanner (new File(System.getProperty("user.dir") + "\\" + "Play.txt"));
			String temp;
			while (fileScan.hasNextLine ())
			{
				temp = fileScan.nextLine();
				if (temp.length () >= 6 && temp.substring(0, 6).equals("/~Mus:"))
				{
					soundName.playSound (temp.substring(6));
				}
				else
				{
					voice.speak(temp);
				}
			}
			fileScan.close ();
		}
		catch (Exception e)
		{

		}
	} 
}
*/