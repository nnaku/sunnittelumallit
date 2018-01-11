package factories;

import clothes.*;

public class AdidasFactory implements Brand{
	
	public Hat wearHat() {
		return new AdidasCloth();
	};

	public Shirt wearShirt() {
		return new AdidasCloth();
	};

	public Pants wearPants() {
		return new AdidasCloth();
	};

	public Shoes wearShoes() {
		return new AdidasCloth();
	};
}
