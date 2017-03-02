package tts;

import com.sun.speech.freetts.VoiceManager;

public class Voice {

	private String name; // the  name of voice being used
	
	private com.sun.speech.freetts.Voice voice; //create an empty instance of the voice clas within sun.speech
	
	public Voice(String name)
	{
		this.name =  name;
		this.voice = VoiceManager.getInstance().getVoice(this.name); // gets voice corresponding to "name" variable;
		this.voice.allocate();
		
	}
	
	public void say(String something)
	
	{
		this.voice.speak(something);
	}
	
	
	public void sayMutiple (String[] sayMePls) {
		for (int i=0; i<sayMePls.length; i++)
		{
			this.say(sayMePls[i]);
			
		}
	
	}
	
}
