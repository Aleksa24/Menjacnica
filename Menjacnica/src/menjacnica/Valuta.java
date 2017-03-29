package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar prodajniKurs;
	private GregorianCalendar kupovniKurs;
	private GregorianCalendar srednjiKurs;
	
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(GregorianCalendar prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public GregorianCalendar getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(GregorianCalendar kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public GregorianCalendar getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(GregorianCalendar srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	
	
	
}
