package wyrazenia;

/**
 * @author radoslaw
 *
 */
public class Stala extends Wyrazenie{
	
	double value;
	/**
	 * konstruktor ustawiajacy watrosc stałej
	 * @param value
	 */
	public Stala(double value) {this.value = value;}
	/* (non-Javadoc)
	 * @see wyrazenia.Wyrazenie#oblicz()
	 */
	@Override
	public double oblicz() {return value;}
	
	@Override
	public String toString() {return "" + value;}

}
