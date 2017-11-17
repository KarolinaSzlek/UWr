package geometria;

public class Odcinek extends Punkt {
	private final Punkt punkt_A,punkt_B;
	
	public Odcinek(Punkt punkt_da, Punkt punkt_db) {
		if (punkt_da==punkt_db) {
			System.err.println("Odcinek tworzą punkty różne od siebie");
			throw new IllegalArgumentException("Odcinek tworzą punktu różne od siebie");
		}
		punkt_A = punkt_da;
		punkt_B = punkt_db;
	}
	public double dlugosc(){
		double xpunktA = punkt_A.getX();
		double ypunktA = punkt_A.getY();
		double xpunktB = punkt_B.getX();
		double ypunktB = punkt_B.getY();
		return Math.sqrt( (xpunktA-xpunktB)*(xpunktA-xpunktB) +(ypunktA-ypunktB)*(ypunktA-ypunktB) );
	}
	
	public String toString ()
    {
        return "["+ punkt_A.toString()+", "+ punkt_B.toString() +"]";
    }
	
	public void przesun(Wektor v){
		punkt_A.przesuń(v);
		punkt_B.przesuń(v);
		//punkt_A.ustawXY(punkt_A.pobierzX() + v.pobierzDX(), punkt_A.pobierzY() + v.pobierzDY());
		//punkt_B.ustawXY(punkt_B.pobierzX() + v.pobierzDX(), punkt_B.pobierzY() + v.pobierzDY());
	}
	
	public void obroc(Punkt p, double kat) {
		punkt_A.obroc(p, kat);
		punkt_B.obroc(p, kat);
	}
	
	public void odbij(Prosta p) 
	{
		punkt_A.odbij(p);
		punkt_B.odbij(p);
	}
	
}
