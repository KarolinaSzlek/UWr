/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Modulo extends Operator2Arg {

	/**
	 * konstruktor
	 * @param a Wyrazenie
	 * @param b Wyrazenie
	 */
	public Modulo(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {
		if(b.oblicz() == 0) throw new IllegalArgumentException("Dzielisz przez 0");
		return a.oblicz()%b.oblicz();
	}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#toString()
	 */
	@Override
	public String toString() {return  a +" mod "+b;}


}
