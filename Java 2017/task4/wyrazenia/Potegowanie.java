/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Potegowanie extends Operator2Arg {

	/**
	 * konstruktor
	 * @param a
	 * @param b
	 */
	public Potegowanie(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.pow(a.oblicz(), b.oblicz());}

	@Override
	public String toString() {return  a +"^"+ b ;}

}
