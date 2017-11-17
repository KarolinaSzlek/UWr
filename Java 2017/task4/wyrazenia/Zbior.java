package wyrazenia;

import java.util.Arrays;

/**
 * @author radoslaw
 *Definiuje zbiór
 */
public class Zbior {
	
	private int max = 10;
	private int stack;
	private Para[] pairs; 
	
	public Zbior(int max)
	{
		if(max < 0) throw new IllegalArgumentException("zbyt mało elem zbioru");
		
		this.max = max;
		Rozpocznij();
	}
	public Zbior()
	{
		Rozpocznij();
	}
	/** 
	 *  ustala rozmiar zbioru
	 */
	private void Rozpocznij()
	{
		this.pairs = new Para[max];
		this.stack = 0;
	}
	
	/**
	 * @return string
	 */
	
	
	@Override 
	public String toString() {return "Zbior{ max = "+ max + " ,stos =" + stack + " ,pary = " + Arrays.toString(pairs) + "}";	}
	
	/**
	 * Szuka po kluczu
	 * @param klucz string
	 * @return Para
	 */
	public Para szukaj(String klucz) 
	{
		for(int i = 0; i < stack; ++i)
			if(klucz.compareTo(pairs[i].getKey()) == 0)
				return pairs[i];
		return null;
	}
	
	/**
	 * wstawai parę
	 * @param para Para
	 * @throws IllegalArgumentException kiedy zbiór jest pełny
	 */
	public void wstaw(Para para) throws IllegalArgumentException
	{
		if(max < stack + 1)
			throw new IllegalArgumentException("zbior jest pełen");
		if(szukaj(para.getKey())!= null)
			System.out.println("Para z takim kluczem już istnieje");
		else
		{
			System.out.println("Para dodana");
			pairs[stack] = para;
			++stack;
		}
	}
	/**
	 * czyta po kluczu
	 * @param klucz Para
	 * @return double
	 */
	public double czytaj(String klucz){return szukaj(klucz).getVal();}
	
	
	/**
	 * wrzuca pare nawet jeśli istnieje już pod takim ID
	 * @param pair Para
	 */
	public void ustal(Para pair)
	{
		if(szukaj(pair.getKey())!=null)
			szukaj(pair.getKey()).setVal(pair.getVal());
		else
			wstaw(pair);
	}
	
	/**
	 * zawraca ilośc elementów zbioru
	 * @return int
	 */
	public int ile() {return stack;}
	
	/**
	 * funkcja całkowicie czyści zbiór
	 */
	public void czysc() {Rozpocznij();}
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(!(o instanceof Zbior)) return false;
		Zbior set = (Zbior) o;
		if(max != set.max) return false;
		if(stack != set.stack) return false;
		
		return Arrays.equals(pairs, set.pairs);
		
	}
	
	
}
