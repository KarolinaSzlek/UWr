
public class Arabic2Romanian {
	
	private final int num; 
	
	private static String[] romanianArray = {"M", "CM", "D", "CD", "C", "XC",
										"L", "XL", "X", "IX", "V", "IV", "I"};
	
	private static int[] arabicArray = {1000, 900, 500, 400, 100, 90, 50,
												40, 10, 9, 5, 4, 1}; 
	
	public Arabic2Romanian(int arabic) {
		if(arabic < 1) throw new NumberFormatException("Value of integer must be positive" );
		if(arabic > 5000 ) throw new NumberFormatException("Value of integer must be under 5K"); 
		num = arabic; 		
	}
	public String toString() {
		String romanian = ""; 
		int N = num; 
		for(int i=0; i< arabicArray.length;i++) {
			while(N >= arabicArray[i]) {
				romanian += romanianArray[i]; 
				N -= arabicArray[i]; 
			}
		}
		return romanian; 
	}
	public int toInt() {return num; }
	

}
