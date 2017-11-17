/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public abstract class Wyrazenie {
	/**
	 * Zwraca wynik obliczenia wyrażenia
	 * @return double
	 */
	public abstract double oblicz();
	
	/**
	 * Zwraca sumę podanych wyrażeń
	 * @param seq Wyrazenie
	 * @return double
	 */
	public static double sumuj(Wyrazenie seq[])
	{
		double sum = 0.0;
		for(Wyrazenie x : seq)
			sum += x.oblicz();
		return sum;
	}
	/**
	 * Zwraca wynik mnżenia wyrażeń
	 * @param seq Wyrazenie
	 * @return double
	 */
	public static double pomnoz(Wyrazenie seq[])
	{
		double sum = seq[0].oblicz();
		for(int i = 1; i < seq.length;++i)
			sum = new Mnozenie(new Stala(sum), seq[i]).oblicz();
		return sum;
	}
	@Override
	public String toString() {return "Wyrazenie{}";}
	
	/**
	 * metode do porównywania wyrażeń
	 */
	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o==null || getClass() != o.getClass()) return false; 
		Wyrazenie tmp = (Zmienna) o;
		return o != null ? o.equals(tmp) : tmp == null;
	}

}
