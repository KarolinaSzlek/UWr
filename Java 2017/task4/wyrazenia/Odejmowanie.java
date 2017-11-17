/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Odejmowanie extends Operator2Arg {

	/**
	 * konstruktor klasy
	 * @param a Wyrazenie
	 * @param b Wyrazenie
	 */
	public Odejmowanie(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return  a.oblicz() - b.oblicz();}
	
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#toString()
	 */
	@Override
	public String toString() {return "( " + a + "-"+b + " )";}

}
