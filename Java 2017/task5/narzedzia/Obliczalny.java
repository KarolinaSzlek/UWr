/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Interfejs opisujący Symbol, każdy obiekt musi być obliczalny
 * @author radoslaw
 *
 */
public interface Obliczalny {
	double obliczWartosc() throws WyjatekONP;
}
