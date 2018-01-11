package factories;

import clothes.*;

public class BossFactory implements Brand {

	public Hat wearHat() {
		return new BossCloth();
	};

	public Shirt wearShirt() {
		return new BossCloth();
	};

	public Pants wearPants() {
		return new BossCloth();
	};

	public Shoes wearShoes() {
		return new BossCloth();
	};
}
