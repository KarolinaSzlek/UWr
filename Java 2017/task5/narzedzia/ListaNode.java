/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * @author radoslaw
 *
 */
public class ListaNode<T> implements Comparable<T>  {
	private T value;
    private ListaNode<T> nextRef;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public ListaNode<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(ListaNode<T> ref) {
        this.nextRef = ref;
    }
	@Override
	public int compareTo(T o) {
		if(o == this.value){
            return 0;
        } else {
            return 1;
        }
	}

}
