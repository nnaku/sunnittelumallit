import factories.*;
import clothes.*;
import java.lang.reflect.*;

public class TestMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
		IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Brand adidas = new AdidasFactory();
		Brand boss = new BossFactory();

		Person jasper = new Person(adidas.wearHat(), adidas.wearShirt(), adidas.wearPants(), adidas.wearShoes());

		System.out.println(jasper.toString() + "\n");

		Constructor<Person> cons = Person.class.getConstructor(Hat.class, Shirt.class, Pants.class, Shoes.class);
		jasper = cons.newInstance(boss.wearHat(), boss.wearShirt(), boss.wearPants(), boss.wearShoes());

		System.out.println(jasper.toString() + "\n");

	}

}
