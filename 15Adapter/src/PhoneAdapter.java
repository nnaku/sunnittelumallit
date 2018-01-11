
public class PhoneAdapter implements Phone {

	private Smartphone smartphone;

	public PhoneAdapter(String callType){
		
	      if(callType.equalsIgnoreCase("voice") ){
	    	  smartphone = new VoiceCall();
	      }else if (callType.equalsIgnoreCase("video")){
	    	  smartphone = new VideoCall();
	      }	
	   }

	@Override
	public void call(String callType, String phoneNumber) {

		if (callType.equalsIgnoreCase("voice")) {
			smartphone.voiceCall(phoneNumber);
		} else if (callType.equalsIgnoreCase("video")) {
			smartphone.videoCall(phoneNumber);
		}

	}

}