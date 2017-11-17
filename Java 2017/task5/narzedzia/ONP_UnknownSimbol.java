/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca bład nieznanego symbolu
 * @author radoslaw
 *
 */
@SuppressWarnings("serial")
public class ONP_UnknownSimbol extends WyjatekONP {

	public ONP_UnknownSimbol(String message) {
		super("Nieznany Symbo" + message);
	}

}
