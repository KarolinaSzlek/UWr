/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * 
 * Klasa opisująca Funkcję
 * @author radoslaw
 *
 */
public class Funkcja extends Symbol implements Funkcyjny {

	public int n; 
	public Double[] array = new Double[arnosc()];
	
	
	/**
	 *  Funkcja do obliczania wartości wyrażenia zależnie od zainicjowanych argumentów klasy funkcja
	 *  @return double wartosc
	 *  @throws WyjatekONP gdy brak argumentow
	 */
	@Override
	public double obliczWartosc() throws WyjatekONP {
		if( this.brakujaceArgumenty() > 0 ) {
            throw new WyjatekONP("Za mało argumentow");
        }
		return 0;
	}

	/* (non-Javadoc)
	 * @see narzedzia.Funkcyjny#arnosc()
	 */
	@Override
	public int arnosc() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see narzedzia.Funkcyjny#brakujaceAargumenty()
	 */
	@Override
	public int brakujaceArgumenty() {
		return arnosc() - n;
	}

	/**
	 * dodaje argumenty do funkcji
     * @param a argument
     * @throws ONP_InvalidExpression w przypadku zbyt wielu argumentów
	 */
	@Override
	public void dodajArgument(double a) throws WyjatekONP {
		if( brakujaceArgumenty() == 0 )
            throw new ONP_InvalidExpression("za dużo argumentów do funkcji");

        switch( arnosc() ){
            case 1:
                array[0] = a;
                ++n;
                break;
            case 2:
                if( brakujaceArgumenty() == arnosc() )
                    array[0] = a;
                else
                    array[1] = a;

                ++n;
                break;
            default:
                break;
        }

	}

}
