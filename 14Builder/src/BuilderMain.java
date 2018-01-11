
public class BuilderMain {

    public static void main(String[] args) {
    	
    	Object burger1,burger2;
    	
        Director director = new Director();
        BurgerBuilder pubM = new PubMakkonen();
        BurgerBuilder hese = new Hese();
        
        director.setBurgerBuilder(pubM);
        director.constructBurger();
        burger1 = director.getBurger();
        
        director.setBurgerBuilder(hese);
        director.constructBurger();
        burger2 = director.getBurger();
        
        System.out.println(((Burger) burger1).getBurger());
        System.out.println(((Burger) burger2).getBurger());
    }
    
}
