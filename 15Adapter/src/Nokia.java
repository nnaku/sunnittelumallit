
public class Nokia implements Phone{
	PhoneAdapter phoneAdapter;

	@Override
	public void call(String callType, String phoneNumber) {

	      if(callType.equalsIgnoreCase("voice") || callType.equalsIgnoreCase("video")){
	    	  phoneAdapter = new PhoneAdapter(callType);
	    	  phoneAdapter.call(callType, phoneNumber);
	      }else{
	         System.out.println(callType+" support under construction.");
	      }
	}
}
