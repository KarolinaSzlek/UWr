/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa obliczajaca wartosc logarytmu loga(b)
 * @author radoslaw
 *
 */
public class Log extends Operator2arg {
	/**
     * Funkcja do obliczania wartości wyrażenia zależnie od zainicjowanych argumentów klasy funkcja
     * @see Funkcja#dodajArgument(double)
     * @return double wartość
     * @throws WyjatekONP w przypadku braku argumentów
     * @throws ONP_InvalidExpression w przypadku złego logarytmu
     */
    @Override
    public double obliczWartosc() throws WyjatekONP {
        super.obliczWartosc();

        if(array[0] <= 1 || array[1] < 0)
            throw new ONP_InvalidExpression("Logarytm bledny");


        return (Math.log(array[1])/Math.log(array[0]));
    }

}
