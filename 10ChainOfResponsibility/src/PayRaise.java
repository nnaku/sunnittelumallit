public abstract class PayRaise {
    
    protected PayRaise successor;
    
    abstract protected boolean raiseLimit(double request);
    abstract protected String getRole();
    
    public void setSuccessor(PayRaise successor) {
        this.successor = successor;
    }
    
    public void processRequest(PayRaiseRequest request) {
        if (raiseLimit(request.getRequest())) {
            System.out.println(getRole() + " can admit pay raise of " + request.getRequest() + " %");
        }else if (successor != null) {
            successor.processRequest(request);
        }
    }
    
    
    
    
}
