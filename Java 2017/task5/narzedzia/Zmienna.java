/**
 * Copyright (c) 2017.
 * @author Radoslaw Madzia
 * @email radoslawmadzia@gmail.com 
 */
package narzedzia;

/**
 * Klasa opisujaca zmienna
 * @author radoslaw
 *
 */
public class Zmienna extends Operand {
	
	public final String identyfikator;

    private double zmienna;

    private final String wzorzec = "\\p{Alpha}\\p{Alnum}*";
    
    @Override
    public String toString() {
        return "Zmienna{" +
                "identyfikator='" + identyfikator + '\'' +
                ", zmienna=" + zmienna +
                '}';
    }

    public Zmienna(String identyfikator_, double zmienna_)
    {

        if (identyfikator_.matches(wzorzec))
        {
            this.identyfikator = identyfikator_;

        } else
        {
            throw new IllegalArgumentException("Podales identyfikator niepasujacy do wzorca: " + wzorzec);
        }
        this.zmienna = zmienna_;
    }


	/* (non-Javadoc)
	 * @see narzedzia.Obliczalny#obliczWartosc()
	 */
	@Override
	public double obliczWartosc() throws WyjatekONP {
		return zmienna;
	}

}
