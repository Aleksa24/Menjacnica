package menjacnica;

import java.util.GregorianCalendar;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class KlasaZaImplementacijuInterfejsa implements MenjacnicaInterfejs {
	public Menjacnica menj;
	
	
	@Override
	public void dodavanjeKursa(Valuta valuta) {
		for (int i = 0; i < (menj.getValute()).length; i++) {
			if((menj.getValute())[i] != null){
				(menj.getValute())[i] = valuta;
				return;
			}
		}
		System.out.println("nema mesta u menjacnici!!!");
		throw new RuntimeException();
	}

	@Override
	public void brisanjeKursa() {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiValutu(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
