public class Superior extends PayRaise{

    @Override
    protected boolean raiseLimit(double request) {
        return request <= 2;
    }

    @Override
    protected String getRole() {
        return "Superior";
    }
    
}