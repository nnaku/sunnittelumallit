package factorymethod;

import otukset.Koira;
import otukset.Opettaja;
import otukset.Oppilas;

public class Main {

	public static void main(String[] args) {
		AterioivaOtus[] otukset = { new Opettaja(), new Koira(), new Oppilas() };
		for (int i = 0; i < otukset.length; i++) {
			otukset[i].aterioi();
		}
	}
}
