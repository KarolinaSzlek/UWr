/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisająca glowny wyjatek ONP
 * @author radoslaw
 *
 */

@SuppressWarnings("serial")
public class WyjatekONP extends Exception {
	public WyjatekONP(String message)
	{
		super(message);
	}

}
