package menjacnicaInterfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodavanjeKursa(Valuta valuta);
	public void brisanjeKursa();
	public Valuta pronadjiValutu(GregorianCalendar datum);
	
}
