/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * * Klasa opisująca wartość wyrażenia Pi
 * @author radoslaw
 *
 */
public class PI extends Operator0arg {
	/**
     * Funkcja do obliczania wartości wyrażenia zależnie od zainicjowanych argumentów klasy funkcja
     * @see Funkcja#dodajArgument(double)
     * @return double wartość
     */
    @Override
    public double obliczWartosc() throws WyjatekONP {
        return Math.PI;
    }
}
