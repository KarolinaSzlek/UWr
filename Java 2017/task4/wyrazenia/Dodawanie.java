package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Dodawanie extends Operator2Arg {
	/**
	 * konstruktor
	 * @param a Wyrazenie
	 * @param b Wyrazenie
	 */
	public Dodawanie(Wyrazenie a, Wyrazenie b) {super(a, b);}
	
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return  a.oblicz() + b.oblicz();}
	
	@Override
	public String toString() {return "( " + a +" + "+ b + " )";}

}
