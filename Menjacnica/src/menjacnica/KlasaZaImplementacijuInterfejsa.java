package menjacnica;

import java.util.GregorianCalendar;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class KlasaZaImplementacijuInterfejsa implements MenjacnicaInterfejs {
// bolje da se koristi ovako sa skracenicom
	public Menjacnica menj;

	
	//u metodi je preglednije koristiti pomocnu promenljivu niz, i dodato je bacanje greske
	@Override
	public void dodavanjeKursa(Valuta valuta) {

		Valuta[] niz = menj.getValute();
		for (int i = 0; i < niz.length; i++) {
			if(niz[i] != null){
				niz[i] = valuta;
				return;
			}
		}
		System.out.println("niz valuta je pun!");
		throw new RuntimeException();

	}

	@Override
	public void brisanjeKursa(Valuta valuta) {
		Valuta[] niz = menj.getValute();
		for (int i = 0; i < niz.length; i++) {
			if(niz[i] == valuta){
				niz[i] = null;
				return;
			}
		}
		System.out.println("valuta ne postoji!");
	}

	@Override
	public Valuta pronadjiValutu(GregorianCalendar datum) {
		Valuta[] niz = menj.getValute();
		for (int i = 0; i < niz.length; i++) {
			if(niz[i].getKupovniKurs() == datum ||
					niz[i].getProdajniKurs() == datum ||
					niz[i].getSrednjiKurs() == datum){
				return niz[i];
			}
		}
		System.out.println("ne postoji takva valuta u nizu");
		return null;
	}

}
