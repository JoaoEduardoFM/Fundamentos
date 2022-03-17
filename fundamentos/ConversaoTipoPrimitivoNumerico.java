package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Implicita
		System.out.println(a);
		
		float b = (float)1.2345; //Explicita (CAST)
		System.out.println(b);
		
		int c = 127; // Implicita
		byte d = (byte)c; //Explicita (CAST)
		System.out.println(d);
		
		double e = 1; // Implicita
		int  f = (int)e;  //Explicita (CAST)
	}

}
