/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca błąd dzielenia - dzielenie przez 0
 * @author radoslaw
 *
 */
@SuppressWarnings("serial")
public class ONP_ZeroDivision extends WyjatekONP {	
	 public ONP_ZeroDivision(String message) {
		super("Dzielenie przez 0: " + message);
		
	}
}
