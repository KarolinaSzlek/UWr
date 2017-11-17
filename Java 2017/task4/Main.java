import wyrazenia.*;

/**
 * 
 */

/**
 * @author radoslaw
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n pary: \n");
		pary();
		System.out.println("\n zbiory: \n");
		zbiory(new Para("key", 2.0), new Para("key", 2.5),new Para("key1", 2.2));
		System.out.println("\n wyrazenia: \n");
		wyrazenia();
		
		
		
		
	}
	public static void pary() {
		Para a = new Para("key", 2.0);
		Para b = new Para("key",2.5);
		Para c = new Para("Key2", 2.4);
		
		System.out.println(a.toString());
		System.out.println(b);
		
		if(a.equals(b)) System.out.println(a + "jest podobne do " + b);
		if(a.equals(c)) System.out.println(a + "jest podbne do " + c);
		else System.out.println(a + "nie jest podobne do " + c);
	}
	
	public static void zbiory(Para a, Para b, Para c)
	{
		Zbior z = new Zbior(3);
		
		z.wstaw(a);
		z.wstaw(b);
		z.wstaw(c);
				
		System.out.println(z);
		System.out.println("szukaj 'key' = " + z.szukaj("key"));
		System.out.println("Ile mamy ich w zbiorze = " + z.ile());
		System.out.println("Jaką ma wartość para o kluczu key = " +  z.czytaj("key") );
		z.czysc();
		System.out.println("wyczyszczony zbior: " + z);
	}
	
	public static void wyrazenia() 
	{
		
		//ex1
		Wyrazenie a = new Dodawanie(new Stala(3.0), new Stala(5.0));
		System.out.println(  "wyrazenie" + a + " oblicza sie do " + a.oblicz());
		//ex2
		Wyrazenie b = new Dodawanie(new Stala(2.0), new Mnozenie(new Zmienna("x"), new Stala(7.0)));
		System.out.println(  "wyrazenie" + b + " oblicza sie do " + b.oblicz());
		//ex3
		Wyrazenie c =
				new Dzielenie(
						new Odejmowanie(
								new Mnozenie( new Stala(3.0),new Stala(11.0)),
								new Stala(1.0)
						),
						new Dodawanie(new Stala(7.0),new Stala(5.0))
				);
		System.out.println(  "wyrazenie" + c + " oblicza sie do " + c.oblicz());
		//ex4
		Wyrazenie d = 
				new Arctan(
						new Dzielenie(
								new Mnozenie(
										new Dodawanie(new Zmienna("x"),new Stala(13.0)),
										new Zmienna("x")
										),
								new Stala(2.0)
						)			
				);
		System.out.println(  "wyrazenie" + d + " oblicza sie do " + d.oblicz());
		//ex5
		Wyrazenie e = 
				new Dodawanie(
						new Potegowanie(new Stala(2.0),new Stala(5.0)),
						new Mnozenie(
								new Zmienna("x"),
								new Logarytmowanie(new Stala(2.0),new Zmienna("y"))
								)
				);
		System.out.println(  "wyrazenie" + e + " oblicza sie do " + e.oblicz());
		
		
		
		//sumowanie i mnozenie wyrazen
		
		Wyrazenie[] w = new Wyrazenie[3];
		w[0] = new Stala(5);
		w[1] = new Stala(3);
		w[2] = new Stala(3);
		
		
		
		System.out.println("\nDodawanie wyrazen " + w[0] +" " +w[1] +" " + w[2] + " tworzy wyrzanie " + Wyrazenie.sumuj(w));
		System.out.println("Mnożenie wyrazen " + w[0]+" " +w[1] +" " + w[2] + " tworzy wyrzanie " + Wyrazenie.pomnoz(w));
		System.out.println("\n" + new Logarytmowanie(new Stala(2),new Stala(3)) + " log2(3)" + new Logarytmowanie(new Stala(2),new Stala(3)).oblicz());
		System.out.println(new WartBezwzgl(new Stala(-5)) + "=" + new WartBezwzgl(new Stala(-5)).oblicz());
		System.out.println(new Cosinus(new Stala(-5)) + "=" + new Cosinus(new Stala(-5)).oblicz());
		System.out.println(new Sinus(new Stala(0.2)) + "=" + new Sinus(new Stala(0.2)).oblicz());
		System.out.println(new Odwrotnosc(new Stala(-5)) + "=" + new Odwrotnosc(new Stala(-5)).oblicz());
		System.out.println(new Przeciwna(new Stala(5)) + "=" + new Przeciwna(new Stala(5)).oblicz());	
		System.out.println(new Maximum(new Stala(-5),new Zmienna("x")) + "=" + new Maximum(new Stala(-5),new Zmienna("x")).oblicz());
		System.out.println(new Minumum(new Stala(-5),new Zmienna("x")) + "=" + new Minumum(new Stala(-5),new Zmienna("x")).oblicz());
		System.out.println(new Modulo(new Stala(5),new Zmienna("y")) + "=" + new Modulo(new Stala(-5),new Zmienna("y")).oblicz());
		
				
	}

}
