package wyrazenia;

/**
 * @author radoslaw
 * Definiuje Zmienną
 */
public class Zmienna  extends Wyrazenie{
	static private final Zbior s;
	
	static{
		s = new Zbior(10);
		s.wstaw(new Para("x", -1.618));
		s.wstaw(new Para("y", 3.0));
		s.wstaw(new Para("z", 4.0));
	}
	
	/**
	 * @param o dowolny obiekt
	 * @return boolean
	 */
	private String value;
	
	public Zmienna(String key) {value = key;}
	public Zmienna(Para para) 
	{
		s.wstaw(para);
	}
		
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o==null || getClass() != o.getClass()) return false; 
		Zmienna varriable = (Zmienna) o;
		return value != null ? value.equals(varriable.value) : varriable.value == null;
	}

	@Override
	public String toString() {return value;} 
	@Override
	public double oblicz() {return s.czytaj(value);}
	
}
