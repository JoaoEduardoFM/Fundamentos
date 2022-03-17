package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("bom ");
		System.out.print("dia!! \n");
		
		System.out.println("bom ");
		System.out.println("dia!!");
		
		System.out.printf("Megasena %d %d %d %d %d %n",1, 2, 3, 4, 5);
		
		System.out.printf("Salario %.1f %n", 1280.750);
		
		System.out.printf("nome: %s%n", "joão");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",nome,sobrenome,idade);
	}

}
