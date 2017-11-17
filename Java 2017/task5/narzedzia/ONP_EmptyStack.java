/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca błąd pustego stosu
 * @author radoslaw
 *
 */
@SuppressWarnings("serial")
public class ONP_EmptyStack extends WyjatekONP {

	public ONP_EmptyStack(String message) {
		super("Empty Stack: " + message);
	}

}
