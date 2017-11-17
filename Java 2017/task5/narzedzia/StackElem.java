/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisująca Element stosu
 * @author radoslaw
 *
 */
public class StackElem {
    Double wartosc;
    StackElem next;

    public StackElem(Double x, StackElem n){
        next=n;
        wartosc=x;
    }

    public StackElem getNext(){
        return next;
    }

    public double getWartosc(){
        return wartosc;
    }
}
