/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Minumum extends Operator2Arg {

	/**
	 * konstruktor 
	 * @param a Wyrazenie
	 * @param b Wyrazenie
	 */
	public Minumum(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.min(a.oblicz(), b.oblicz());}
	@Override
	public String toString() {return "min(" + a +","+b + ")" ;}

}
