/**
 * 
 */
package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Logarytmowanie extends Operator2Arg {

	/**
	 * konstruktor
	 * @param a
	 * @param b
	 */
	public Logarytmowanie(Wyrazenie a, Wyrazenie b) {super(a, b);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() throws IllegalArgumentException 
	{
		if(a.oblicz() <= 1 || b.oblicz() < 0) throw new IllegalArgumentException("Logarytm błędny");
		return Math.log(b.oblicz())/Math.log(a.oblicz());
	}
	
	@Override
	public String toString() {return "Log(" + a +","+ b + ")" ;}

}
