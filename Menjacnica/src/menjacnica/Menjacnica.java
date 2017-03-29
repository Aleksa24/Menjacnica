package menjacnica;

import java.util.Arrays;

public class Menjacnica {

	private Valuta[] valute;

	public Valuta[] getValute() {
		return valute;
	}

	public void setValute(Valuta[] valute) {
		this.valute = valute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(valute);
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
		Menjacnica other = (Menjacnica) obj;
		if (!Arrays.equals(valute, other.valute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String x = "";
		for (int i = 0; i < valute.length; i++) {
			x = x + valute[i].toString() + "\n";
		}
		return x;
	}
	
	
	
}
