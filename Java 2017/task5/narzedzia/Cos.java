/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa do obliczania wartosci cos
 * @author radoslaw
 *
 */
public class Cos extends Operator1arg {
    /**
     * Funkcja do obliczania wartości wyrażenia zależnie od zainicjowanych argumentów klasy funkcja
     * @see Funkcja#dodajArgument(double)
     * @return double wartość
     * @throws WyjatekONP w przypadku braku argumentów
     */
    @Override
    public double obliczWartosc() throws WyjatekONP {
        super.obliczWartosc();
        return Math.cos(array[0]);
    }
	

}
