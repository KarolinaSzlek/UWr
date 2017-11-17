/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca błąd błędnego wyrażenia
 * @author radoslaw
 *
 */
@SuppressWarnings("serial")
public class ONP_InvalidExpression extends WyjatekONP {

	public ONP_InvalidExpression(String message) {
		super("Invalid Expression: " + message);
	}
	public ONP_InvalidExpression() {
		super("Invalid Expresion");
	}

}
