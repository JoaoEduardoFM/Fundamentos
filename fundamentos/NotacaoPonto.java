package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		double a = 2.3 ;
		String s = "bom dia X";
		
		s = s.toUpperCase();
		// toUpperCase converte para letras maiusculas
		s = s.replace("X", "fulano");
		// substitui caractere escrito na variavel
		s = s.concat("!!! birinbal");
		// concatena outra string do codigo
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		// toUpperCase converte para letras  maisculas
		
		String x = "LEO".toLowerCase();
		// toLowerCase converte para letras minusculas
		System.out.println(x);
		
		String y = "Bom dia Tadeu".replace("Tadeu","AQUELE QUE TE COMEU".toLowerCase().concat("!!"));
		System.out.println(y);
	
	}

}
