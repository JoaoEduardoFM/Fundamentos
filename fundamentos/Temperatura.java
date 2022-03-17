package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// converter fahrenheit para celsius
		//(fº - 32 ) x 5/9 = cº
		final double  fator = 5.0/9.0; 	
		final double ajuste = 32;
		
		double fahrenheit = 1 ;
		double celsius = (fahrenheit - ajuste) * fator ;
		
		System.out.println("O resultado é "+ celsius +" Cº");
	}

}
