
public class Main {
	public static void main(String[] args) {
		if(args.length == 0)
			System.err.println("Nie podano argumentu");
		for(int i = 0; i < args.length; i++)
		{
			long n = Long.parseLong(args[i]);
			if(n > Long.MAX_VALUE-1 || n < Long.MIN_VALUE+1) System.err.println("Program działa poprawnie dla liczb z przedziału (long.min_value, long.max_value]");
			long[] p = LiczbyPierwsze.naCzynnikiPierwsze1(n);
			System.out.print(n + " = ");
			if(n <0) System.out.print("-");
			System.out.print("1 * ");
			for(int j = 0; j < p.length;j++) {
				System.out.print(p[j] + "");
				if(p[j+1]==0) break;
				if(j<p.length-1) System.out.print(" * ");
				
			}
			System.out.println("");	
		}
	}

}
