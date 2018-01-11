package parts;

import java.util.ArrayList;

public class Motherboard extends PartObject{
	
    ArrayList<Part> childs = new ArrayList<Part>();
    
    public Motherboard(int price) {
        this.price = price;
    }
    
    @Override
    public void addPart(Part part) {
        childs.add(part);
    }
    
    @Override
    public int getPrice() {
        int sum = 0;
        for (Part part : childs) {
            sum += part.getPrice();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return "Motherboard:" + this.price + "\nInstalled hardware:" + (getPrice()-this.price);
    }
}