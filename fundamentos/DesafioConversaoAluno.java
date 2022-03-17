package fundamentos;

import java.util.Scanner;

public class DesafioConversaoAluno {
	
	public static void main(String[] args) {
		//criar apartir do scnner
		//3 strings usando o nextline
		// recebendo os utimos 3 salarios de um funcionario
		// calcular a media dos ultimos 3 salarios do funcionario /3
		// separar as casas decimais tanto com . ou com ,
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario:");
		double salario1 = entrada.nextDouble();
		System.out.println("Digite o segundo salario;");
		double salario2 = entrada.nextDouble();
		System.out.println("Digite o terceiro salario;");
		double salario3 = entrada.nextDouble();
			
		double soma = salario1+ salario2 +salario3;
		
		System.out.printf("Pimeiro salario %s \n Segundo salario %s \n Terceiro salario %s \n ",salario1,salario2,salario3);
		
	System.out.println(" a soma dos 3 salarios é de:"+(float) soma);
    System.out.println(" A média dos 3 salario é de "+(float) soma/3);
	}

}
