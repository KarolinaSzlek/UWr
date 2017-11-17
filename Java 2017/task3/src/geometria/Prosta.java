package geometria;

public class Prosta {
	private final double a,b,c;
	
	public Prosta(double ax, double by, double c1)
	{
		this.a = ax;
		this.b = by;
		this.c = c1;
	}
	
	public static Prosta przesun(Prosta p, Wektor v)
	{
		Prosta w = new Prosta(p.a,p.b,(p.c - (p.a * v.pobierzDX()) - (p.b * v.pobierzDY())));
		return w;
	}
	
	
	
	public static boolean czRownolegle(Prosta p1, Prosta p2) 
	{
		if(p1.a * p2.b == p2.a * p1.b) 
			return true;
		return false;
	}
	
	
	public static boolean czProstopadle(Prosta p1, Prosta p2) 
	{
		if(((p1.a * p2.a) + (p1.b * p2.b))==0)
			return true;
		return false;
	}
	
	public static Punkt punktPrzeciecia(Prosta p1, Prosta p2)
	{
		Punkt przeciecia = new Punkt();
		if(czRownolegle(p1,p2)) {
			System.out.println("proste nie mają punktu przecięcia");
			return przeciecia;
		}
		double w = p1.a * p2.b - p2.a * p1.b;
		double wx = ((- p1.c) * p2.b) -( (-p2.c) * p1.b);
		double wy = (p1.a * (- p2.c)) - (p2.a * (-p1.c));
		
		przeciecia.ustawX(wx/w);
		przeciecia.ustawY(wy/w);
				
		return przeciecia;
	}
	public static double geta(Prosta p) {return p.a;}
	public static double getb(Prosta p) {return p.b;}
	public static double getc(Prosta p) {return p.c;}
	public String toString()
	{
		return a + "x" + "+" + b  + "y" +"+"+ c;
 	}
	
	

}
