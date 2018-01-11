import clothes.*;

public class Person {
	Hat hat;
	Shirt shirt;
	Pants pants;
	Shoes shoes;

	public Person(Hat hat, Shirt shirt, Pants pants, Shoes shoes) {
		this.hat = hat;
		this.shirt = shirt;
		this.pants = pants;
		this.shoes = shoes;
	}

	@Override
	public String toString() {
		return "Hat:"+hat+"\nShirt:"+shirt+"\nPants:"+pants+"\nShoes:"+shoes;
	}

}
