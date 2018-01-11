package parts;

import java.util.ArrayList;

public class Chassis extends PartObject {

	ArrayList<Part> childs = new ArrayList<Part>();

	public Chassis(int price) {
		this.price = price;
	}

	@Override
	public void addPart(Part part) {
		childs.add(part);
	}

	
	public int getPrice() {
		int sum = 0;
		for (Part part : childs) {
			sum += part.getPrice();
		}
		return sum;
	}

	public String toString() {
		return "Chassis:" + this.price + "\nInstalled hardware:" + (getPrice()-this.price);
	}
}
