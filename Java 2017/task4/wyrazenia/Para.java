package wyrazenia;

/**
 * @author radoslaw
 *definiuje parę klucz - wartość
 */
public class Para {
	public final String key; 
	private double value; 
	/**
	 * tworzy parę na podstwie klucza i wartosć 
	 * @param klucz double
	 * @param wartosc double
	 */
	public Para(String klucz, double wartosc)
	{
		this.key = klucz;
		this.value = wartosc; 
	}
	/**
	 * zawraca wartość przypisaną dla danego klucza
	 * @return value double
	 */
	public double getVal() {return value; }
	/**
	 * ustwia wartość klucza 
	 * @param wartosc double
	 */
	public void setVal(double wartosc) { this.value = wartosc;}
	
	public String getKey() {return key;}
	
	@Override //evading singature issue when overriding
	public String toString() {return "Para{" + "klucz = " + key + " , wartość = " +  value + "}";}
	
	@Override 
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Para pair = (Para) o;
		
		return key != null ? key.equals(pair.key) : pair.key == null;
	}
	
	

}
