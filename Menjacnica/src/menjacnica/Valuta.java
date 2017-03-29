package menjacnica;

import java.util.GregorianCalendar;

import javax.management.RuntimeErrorException;

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
		if (naziv == null || naziv.isEmpty()) {
			throw new RuntimeException();
		}else{
		this.naziv = naziv;
			}
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.isEmpty()){
			throw new RuntimeException();
		}else{
		this.skraceniNaziv = skraceniNaziv;
		}
	}
	public GregorianCalendar getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(GregorianCalendar prodajniKurs) {
		if(prodajniKurs == null){
			throw new RuntimeException();
		}else{
			this.prodajniKurs = prodajniKurs;	
		}
	}
	public GregorianCalendar getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(GregorianCalendar kupovniKurs) {
		if(kupovniKurs == null){
			throw new RuntimeException();
		}
		this.kupovniKurs = kupovniKurs;
	}
	public GregorianCalendar getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(GregorianCalendar srednjiKurs) {
		if(srednjiKurs == null){
			throw new RuntimeException();
		}
		this.srednjiKurs = srednjiKurs;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kupovniKurs == null) ? 0 : kupovniKurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((prodajniKurs == null) ? 0 : prodajniKurs.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		result = prime * result + ((srednjiKurs == null) ? 0 : srednjiKurs.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kupovniKurs == null) {
			if (other.kupovniKurs != null)
				return false;
		} else if (!kupovniKurs.equals(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (prodajniKurs == null) {
			if (other.prodajniKurs != null)
				return false;
		} else if (!prodajniKurs.equals(other.prodajniKurs))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (srednjiKurs == null) {
			if (other.srednjiKurs != null)
				return false;
		} else if (!srednjiKurs.equals(other.srednjiKurs))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "naziv: " + naziv + ", skraceni naziv: " + skraceniNaziv + ", prodajni kurs: " + prodajniKurs
				+ ", kupovni kurs: " + kupovniKurs + ", srednji kurs: " + srednjiKurs + "";
	}
	
	
	
	
}
