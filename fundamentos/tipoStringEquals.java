package fundamentos;

import java.util.Scanner;

public class tipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2"?"verdadeiro":"falso");//verdadeiro
		
		String s1= new String("2");
		System.out.println("2" == s1?"verdadeiro":"falso");//falso
		System.out.println("2".equals(s1)?"verdadeiro":"falso");//verdadeiro
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor é igual a 2? ");

		String s2 = entrada.next();
		System.out.println("2" == s2.trim()?"verdadeiro":"falso");//falso pois o equals faz a comparacao com string
		System.out.println("2".equals(s2.trim())?"verdadeiro":"falso");//verdadeiro
		
	}

}
