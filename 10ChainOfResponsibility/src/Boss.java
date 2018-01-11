public class Boss extends PayRaise{

    @Override
    protected boolean raiseLimit(double request) {
        return request < 5;
    }

    @Override
    protected String getRole() {
        return "Boss";
    }
    
}