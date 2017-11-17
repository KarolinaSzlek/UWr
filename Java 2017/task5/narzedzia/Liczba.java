/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca liczbę
 * @author radoslaw
 *
 */
public class Liczba implements Obliczalny {

	double wartosc;
	
	 /**
     * Konstruktor z ustaleniem wartości liczby
     * @param wartosc wartość liczby
     */
	public Liczba(double wartosc)
	{
		this.wartosc = wartosc;
	}
	
	
	
	 /**
     * Funkcja do obliczania wartości wyrażenia zależnie od zainicjowanych argumentów klasy funkcja
     * @see Funkcja#dodajArgument(double)
     * @return double wartość
     * @throws WyjatekONP w przypadku braku argumentów
     */
	
	@Override
	public double obliczWartosc() throws WyjatekONP {
		return wartosc;
	}

}
