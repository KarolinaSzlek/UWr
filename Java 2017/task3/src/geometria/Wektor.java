package geometria;

public class Wektor {
	private final double dx,dy;
	
	
	public Wektor(double x, double y)
	{
		dx = x;
		dy = y;
	}
	public Wektor() {
		dx = 0;
		dy = 0;
	}
	public Wektor(double c) {
		dx = c;
		dy = c;
	}
	public double pobierzDX()
	{
		return dx;
	}
	public double pobierzDY()
	{
		return dy;
	}
	
	public static Wektor DodajWektor(Wektor v1, Wektor v2)
	{
		Wektor x = new Wektor(v1.pobierzDX() + v2.pobierzDX(),v1.pobierzDY() + v2.pobierzDY());
		return x;		
	}
	public static Wektor odwrotny(Wektor x)
	{
		return new Wektor(-x.pobierzDX(),-x.pobierzDY());
		
	}
	public String toString()
	{
		return "[" + dx + "," + dy + "]"; 
	}
	
	

}
