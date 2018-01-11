package parts;


public abstract class PartObject implements Part {
    int price;

    public void addPart(Part part) {}
    
    public int getPrice() {
        return this.price;
    }
}
