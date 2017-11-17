package wyrazenia;

public class Arctan extends Operator1Arg{
	/**
	 * konstruktor
	 * @param a Wyrazenie
	 */
	public Arctan(Wyrazenie a) {super(a);}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.atan(a.oblicz());}
	
	@Override
	public String toString() {return " arctan( " + a + " )";}

}
