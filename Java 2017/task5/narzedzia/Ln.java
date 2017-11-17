/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * @author radoslaw
 *
 */
public class Ln extends Operator1arg {


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

        if(array[0] < 0)
        {
            throw new ONP_InvalidExpression("logarytm błędny");
        }

        return Math.log(array[0]);
    }
}
