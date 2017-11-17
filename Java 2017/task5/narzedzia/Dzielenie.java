/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa do obliczenia wartosci mnozenia dwoch wyrazen
 * @author radoslaw
 *
 */
public class Dzielenie extends Operator2arg {


	 /**
     * Funkcja do obliczania wartości wyrażenia zależnie od zainicjowanych argumentów klasy funkcja
     * @see Funkcja#dodajArgument(double)
     * @return double wartość
     * @throws WyjatekONP w przypadku braku argumentów
     * @throws ONP_ZeroDivision w przypadku dzielenia przez 0
     */
    @Override
    public double obliczWartosc() throws WyjatekONP {
        super.obliczWartosc();

        if( array[0] == 0 )
            throw new ONP_ZeroDivision(array[1].toString() + " / " + array[0].toString());

        return array[1] / array[0];
    }

}
