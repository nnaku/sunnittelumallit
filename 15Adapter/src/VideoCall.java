
public class VideoCall implements Smartphone {

	@Override
	public void voiceCall(String phoneNumber) {
	}

	@Override
	public void videoCall(String phoneNumber) {
		System.out.println("Video Call to " + phoneNumber);
	}

}
