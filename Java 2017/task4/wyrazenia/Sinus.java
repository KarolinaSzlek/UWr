package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Sinus extends Operator1Arg {
	/**
	 * konstruktor klasy
	 * @param a Wyrazenie
	 */
	public Sinus(Wyrazenie a) {super(a);}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.sin(a.oblicz());}
	
	@Override
	public String toString() {return "sinus (" + a + ")";}


}
