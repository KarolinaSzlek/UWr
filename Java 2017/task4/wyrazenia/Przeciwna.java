package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Przeciwna extends Operator1Arg{
	/**
	 * konstruktor
	 * @param a Wyrazenie
	 */
	public Przeciwna(Wyrazenie a) {super(a);}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return a.oblicz() * (-1.0);}
	
	@Override
	public String toString() {return "(-1)*" + a;} 
	

}
