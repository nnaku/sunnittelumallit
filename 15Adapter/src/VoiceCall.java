
public class VoiceCall implements Smartphone{

	@Override
	public void voiceCall(String phoneNumber) {
		System.out.println("Voice Call to "+phoneNumber);
	}

	@Override
	public void videoCall(String phoneNumber) {		
	}

}
