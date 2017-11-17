package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Cosinus extends Operator1Arg {

	public Cosinus(Wyrazenie a) {super(a);}

	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return Math.cos(a.oblicz());}
	
	@Override
	public String toString() {return "cosinus (" + a + ")";}

}
