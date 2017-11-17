
public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) 
			try {
				int n = Integer.parseInt(args[i]);
				Arabic2Romanian N = new Arabic2Romanian(n); 			
				System.out.println(n + " " + Integer.parseInt(args[i]) + " " + N.toInt() + " = " + N.toString());						
				
			} 
			catch(NumberFormatException e) { throw new IllegalArgumentException(args[i] + " nie należy do przediału (0;5000] lub nie jest liczbą"); }
	}
		
}
		