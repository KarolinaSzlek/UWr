/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Dzielenie extends Operator2Arg {

	/**
	 * konstruktor
	 * @param a
	 * @param b
	 */
	public Dzielenie(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() 
	{
		if(b.oblicz() == 0) throw new IllegalArgumentException("Dzielisz przez 0");
		return a.oblicz()/b.oblicz();
	}
	@Override
	public String toString() {return  a +"/"+b;}

}
