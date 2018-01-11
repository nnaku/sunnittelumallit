public class TestMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
    	PcBuilder pc = new PcBuilder();
    	
    	System.out.println(pc.motherboard.toString());
    	System.out.println(pc.chassis.toString());
    	System.out.println(pc.getPrice());
    }
    
}