import java.math.BigInteger;
public final class LiczbyPierwsze {
	
	public static boolean czyPierwsza(long x) {
		for(long i = 2; i<=(long)Math.sqrt(x);i++)
			if(x%i == 0)
				return false;
		return true;
	}
	
	public static long[] naCzynnikiPierwsze1(long x) {
		if(x<0) x = -x; 
		
		long[] w = new long[1<<21];
		int counter =0;  
		long mnoznik = 0L;
		for(long i = 2L; i<=x/i;) {   
			if( x%i == 0) {   
				mnoznik = i;      
				w[counter]= mnoznik;
				counter+=1;
				x /= i;  
			}
			else i++;
		}
		if(mnoznik < x) 
			w[counter]=x;
		else
			w[counter]=mnoznik; 
			
		return w;
		
			}
		

}
