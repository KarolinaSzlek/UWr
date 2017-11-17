/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Mnozenie extends Operator2Arg {

	/**
	 * konstruktor
	 * @param a Wyrazenie
	 * @param b Wyrazenie
	 */
	public Mnozenie(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return a.oblicz() * b.oblicz();}
	
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#toString()
	 */
	@Override
	public String toString() {return  a +"*"+ b ;}


}
