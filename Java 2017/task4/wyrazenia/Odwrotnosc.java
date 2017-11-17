package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Odwrotnosc extends Operator1Arg {
	/**
	 * konstruktor klasy
	 * @param a Wyrazenie
	 */
	public Odwrotnosc(Wyrazenie a) {super(a);}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.pow(a.oblicz(), -1.0);}
	
	@Override
	public String toString() {return a + "^(-1)";}
}
