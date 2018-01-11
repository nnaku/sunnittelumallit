public class CEO extends PayRaise{

    @Override
    protected boolean raiseLimit(double request) {
        return request >= 5;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
    
}