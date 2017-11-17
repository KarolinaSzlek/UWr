package geometria;

public class Punkt {

	private double x, y;
	
	public Punkt (double x, double y){
		this.x = x; // referencja this jest tutaj konieczna
	    this.y = y; // ponieważ nastąpiło przesłonięcie nazw pól w klasie przez nazy parametrów
	}
	public Punkt() {
		this.x=0;
		this.y=0;
	}
	
	public Punkt (double c)
    {
        this.x = c;
        this.y = c;
    }
	
	public double getX(){return x;}
	public double getY(){return y;}
	
	public void ustawX(double px){this.x = px;}
	public void ustawY(double py){this.y = py;}
	
	public void ustawXY(double px, double py){
		this.x = px;
		this.y = py;
	}
	
	public void przesuń (Wektor v)
    {
        this.x = x + v.pobierzDX();
        this.y = y + v.pobierzDY();
    }
	
	public void obroc(Punkt p, double kat) 
	{

		
		double sin = Math.sin(Math.toDegrees(kat));
		double cos = Math.cos(Math.toDegrees(kat));
		x = x * cos - y * sin - p.x * cos + p.y * sin + p.x;
		y = (x * sin )+ y * cos - p.x * sin - p.y * cos + p.y; 

		
		
		/*
			przesuń(Wektor.odwrotny(new Wektor(p.x,p.y) ));
			double sin = Math.sin(Math.toRadians(kat)); //Math.sin(Math.toDegrees(kat));
			double cos = Math.cos(Math.toRadians(kat)); //Math.cos(Math.toDegrees(kat));
			x = x * cos - y * sin;
			y = x * sin + y * cos;
			przesuń(new Wektor(p.x,p.y) );
		*/	
		
		
	}
	
	public void odbij(Prosta p) 
	{
		double a1 = Prosta.geta(p)/(Math.sqrt((Math.pow(Prosta.geta(p), 2))+(Math.pow(Prosta.getb(p), 2))));
		double b1 = Prosta.getb(p)/(Math.sqrt((Math.pow(Prosta.geta(p), 2))+(Math.pow(Prosta.getb(p), 2))));
		double d = a1 * x + b1 * y + Prosta.getc(p);
		this.x = x - 2*d*a1;
		this.y = y - 2*d*b1;
	}
	
    public String toString ()
    {
        return "("+x+", "+y+")";
    }

	
	
	   
}
