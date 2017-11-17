/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca Element kolejki
 * @author radoslaw
 *
 */
public class Element {
	Funkcja wartosc;
    Element next;

    /**
     * Konstruktor Elementu kolejki
     * @param x funkcja
     */
    public Element(Funkcja x){
        wartosc = x;
        next = null;
    }

    public void setNext(Element e){
        next = e;
    }

}
