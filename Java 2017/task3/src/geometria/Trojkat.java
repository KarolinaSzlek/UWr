package geometria;

public class Trojkat extends Punkt {

	private Punkt punkt_a, punkt_b, punkt_c;
	
	public Trojkat(Punkt a, Punkt b, Punkt c) {
		if(a == b) {
			System.err.println("Odcinek tworzą punkty różne od siebie");
			throw new IllegalArgumentException("Odcinek tworzą punktu różne od siebie");
		}
		if(c == b) {
			System.err.println("Odcinek tworzą punkty różne od siebie");
			throw new IllegalArgumentException("Odcinek tworzą punktu różne od siebie");
		}
		if(a == c) {
			System.err.println("Odcinek tworzą punkty różne od siebie");
			throw new IllegalArgumentException("Odcinek tworzą punktu różne od siebie");
		}
			
		this.punkt_a = a;
		this.punkt_b = b;
		this.punkt_c = c;
	}
	public Trojkat(double ax, double ay, double bx, double by,double cx, double cy)
	{
		this.punkt_a = new Punkt(ax,ay);
		this.punkt_b = new Punkt(bx,by);
		this.punkt_c = new Punkt(cx,cy);
	}
	
	public void ustawA(Punkt a)
	{
		this.punkt_a = a;
	}
	public void ustawB(Punkt b)
	{
		this.punkt_b = b;
	}
	public void ustawC(Punkt c)
	{
		this.punkt_c = c;
	}
	
	
	public void przesun(Wektor v){
		punkt_a.przesuń(v);
		punkt_b.przesuń(v);
		punkt_c.przesuń(v);
		//punkt_a.ustawXY(punkt_a.pobierzX() + v.pobierzDX(), punkt_a.pobierzY() + v.pobierzDY());
		//punkt_b.ustawXY(punkt_b.pobierzX() + v.pobierzDX(), punkt_b.pobierzY() + v.pobierzDY());
		//punkt_c.ustawXY(punkt_c.pobierzX() + v.pobierzDX(), punkt_c.pobierzY() + v.pobierzDY());
	}
	
	public void obroc(Punkt p, double kat) {
		punkt_a.obroc(p, kat);
		punkt_b.obroc(p, kat);
		punkt_c.obroc(p, kat);
	}
	
	public void odbij(Prosta p) 
	{
		punkt_a.odbij(p);
		punkt_b.odbij(p);
		punkt_c.odbij(p);
	}
	
	public String toString ()
    {
        return "[ wierzcholek A="+ punkt_a.toString()+",wierzchołek B=  "+ punkt_b.toString() + ", wierzczołek C= "+ punkt_c.toString() +"]";
    }
}
