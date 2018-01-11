package otukset;

import factorymethod.AterioivaOtus;
import juomat.Juoma;
import juomat.Vesi;
import ruuat.Ruoka;
import ruuat.Makkara;

public class Koira extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Vesi();
	};

	public Ruoka createRuoka() {
		return new Makkara();
	};
}
