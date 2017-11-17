/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisujaca stos
 * @author radoslaw
 *
 */
public class Stos {
	StackElem start;

    Stos() {
        start = null;
    }

    public StackElem getStart() {
        return start;
    }

    public void push(Double x) {
        StackElem temp = new StackElem(x, start);
        start = temp;
    }

    public void pop() throws ONP_EmptyStack {
        if (start != null) {
            start = start.getNext();
        } else {
            throw new ONP_EmptyStack("Stos jest pusty");
        }

    }

    public double value()
    {
        return start.getWartosc();

    }

    public int zlicz() {
        if (start != null) {
            StackElem temp = start;
            int licznik = 0;
            while (temp != null) {
                licznik++;
                temp = temp.getNext();
            }
            return licznik;
        } else return 0;
    }

    public void show(){
        if(start!=null){
            StackElem temp = start;
            while(temp!=null){
                System.out.print(temp.getWartosc() + " ");
                temp=temp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("Stos jest pusty");
        }
    }


}
