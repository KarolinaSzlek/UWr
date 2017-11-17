/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Maximum extends Operator2Arg {

	/**
	 * konstruktor
	 * @param a
	 * @param b
	 */
	public Maximum(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.max(a.oblicz(), b.oblicz());}
	
	@Override
	public String toString() {return "max(" + a +","+b + ")" ;}

}
