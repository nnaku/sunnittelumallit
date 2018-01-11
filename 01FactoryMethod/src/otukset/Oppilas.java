package otukset;

import factorymethod.AterioivaOtus;
import juomat.Juoma;
import juomat.Olut;
import ruuat.Ruoka;
import ruuat.Makaroni;

public class Oppilas extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Olut();
	};

	public Ruoka createRuoka() {
		return new Makaroni();
	};
}
