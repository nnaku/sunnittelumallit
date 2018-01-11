package otukset;

import factorymethod.AterioivaOtus;
import juomat.Juoma;
import juomat.Maito;
import ruuat.Ruoka;
import ruuat.Pihvi;

public class Opettaja extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Maito();
	};

	public Ruoka createRuoka() {
		return new Pihvi();
	};
}
