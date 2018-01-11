
public class Director {
    private BurgerBuilder buBu;
    
    public void setBurgerBuilder(BurgerBuilder buBu) {
        this.buBu = buBu;
    }
    
    public Object getBurger() {
        return buBu.getBurger();
    }
    
    public void constructBurger() {
        buBu.createNewBurger();
        buBu.buildBurger();
    }
}

