/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * interfejs opisujacy funkcje
 * @author radoslaw
 *
 */
public interface Funkcyjny extends Obliczalny{
	/**
	 * 
	 * @return int arność funkcji 
	 */
	int arnosc();
	/**
	 * Zwraca ilość brakujących argumentów
	 * @return int brakujace argumenty dla funkcji
	 */
	int brakujaceArgumenty();
	/**
	 * dodaje argumenty do funkcji
	 * @param a argument
	 * @throws WyjatekONP wyjatek
	 */
	void dodajArgument(double a) throws WyjatekONP;
}
