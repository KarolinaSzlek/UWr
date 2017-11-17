package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class WartBezwzgl extends Operator1Arg{
	/**
	 * konstruktor klasy
	 * @param a
	 */
	public WartBezwzgl(Wyrazenie a) {super(a);}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.abs( a.oblicz() );}

	public String toString() {return "|" + a + "|";}
}
