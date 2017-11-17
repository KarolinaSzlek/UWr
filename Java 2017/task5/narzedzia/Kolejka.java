/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;


/**
 * Klasa opisująca kolejke
 * @author radoslaw
 *
 */
public class Kolejka {
	Element first, last;

    public Kolejka(){
        first = last = null;
    }

    /**
     * Dodawanie nowego elementu kolejki
     * @param x funkcja
     */
    public void add(Funkcja x){

        Element temp = new Element(x);
        if(first==null){
            first = last = temp;
        }
        else {
            last.setNext(temp);
            temp.setNext(last);
            last = temp;
        }

    }
}
