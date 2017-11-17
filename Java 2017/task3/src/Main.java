import geometria.Odcinek;
import geometria.Prosta;
import geometria.Punkt;
import geometria.Trojkat;
import geometria.Wektor;

public class Main {

	public static void main(String[] args) {
		/*Punkt x = new Punkt(1,0);
		Punkt x2 = new Punkt(3,4);
		Punkt x3 = new Punkt(8,4);
		Punkt zero = new Punkt(0,0);
		
		
		
		Wektor v = new Wektor(3,-2);
		Wektor v1 = new Wektor(3,2);
		Wektor v3 = new Wektor(3,-4);
		

		Odcinek o1 = new Odcinek(x,x2);
		Odcinek o = new Odcinek(x2,x);
		
		Trojkat t = new Trojkat(x,x2,x3);
		
		Prosta p = new Prosta(4,7,1);
		Prosta p1 = new Prosta(1,1,4);
		Prosta p2 = new Prosta(-2,-5,4);
		
		System.out.println("===================punkt===============\n");
		
		System.out.println("punkt x = " + x.toString());
		System.out.println("współrzędna x = " +x.getX());
	
		x.ustawX(4.1);
		System.out.println("pkt x po zmianie "+x.toString());
		
		x.przesuń(v);
		System.out.println("pkt x po przesunieciu "+x.toString());

		
		
		x2.odbij(p1);
		x2.odbij(p);
		System.out.println("pkt x2 po odbiciu względem OY i OX "+x2.toString());
		
		
		System.out.println("\n===================wektor===============\n");
		
		System.out.println("wektor v = " + v.toString());
		System.out.println("wektor v1 = " + v1.toString());
		
		Wektor v2 = Wektor.DodajWektor(v1, v);
		System.out.println("Dodane wyektory v,v1 "+v2.toString());
		
		System.out.println("\n===================odcinek===============\n");
		
		System.out.println("Odcinek o " + o.toString());
		
		System.out.println("Odcinek o1 " + o1.toString());
		o1.przesun(v2);
		System.out.println("Odcinek o1 przesunięty o wektor v2 " + o1.toString());
		o1.odbij(p1);
		o1.odbij(p);
		System.out.println("Odcinek o1 po odbiciu względem OY i OX " + o1.toString());
		o1.odbij(p2);
		System.out.println("Odcinek o1 po odbiciu względem -2x-5y+4 " + o1.toString());
		
		
		System.out.println("\n===================trojkat===============\n");
		System.out.println(t.toString());
		t.przesun(v1);
		System.out.println("trojkat przesunięty o wektor [3,2] " + t.toString());
		t.obroc(zero, 60);
		System.out.println(t.toString());
		t.odbij(p1);
		t.odbij(p);
		System.out.println("trojkat po odbiciu względem OY i OX " + o1.toString());
		
		System.out.println("\n===================prosta===============\n");
		
		System.out.println(Prosta.czProstopadle(p, p1));
		System.out.println(Prosta.czRownolegle(p, p1));
		System.out.println(Prosta.punktPrzeciecia(p1, p).toString());
		System.out.println(p2.toString());
		System.out.println(Prosta.przesun(p2, v3).toString());
		
		Punkt zero1 = new Punkt(0,0);
		Punkt xplan = new Punkt(1,0);
		xplan.obroc(zero1, 180);
		System.out.println("pkt x plan po obroceniu "+xplan.toString());
		/* 
		 * 
		 */
		Wektor v = new Wektor(0,3);
		Wektor v1 = new Wektor(0,5);
		Prosta x = new Prosta(-2,-5,4);
		System.out.println(Prosta.przesun(x, v).toString());
		System.out.println(Prosta.przesun(x, v1).toString());
		
	}

}
