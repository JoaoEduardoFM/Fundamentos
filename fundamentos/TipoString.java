package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("a posicão selecionada foi: "+"Olá pessoal".charAt(2));
		// charAt seleciona o caractere na posição que voce deseja
		
	String a = "boa tarde";
	
	System.out.println(a +"!!!");
	//+ = concatena a variavel informada
	System.out.println(a.concat("!!!"));
	//concat= concatena a variavel informada.
	System.out.println("toUpperCase: "+a.toUpperCase().concat("!!!"));
	//toUpperCase = deixa os caracteres em maiusculo.
	//toLowerCase = deixa os caracteres em minusculo.
	System.out.println("endsWith: "+a.endsWith("tarde"));
	//endsWith = verifica se a variavel termina dando v ou f.
	System.out.println("startsWith: "+a.startsWith("Boa"));
	//startsWith = inicia com: v ou f.
	System.out.println("length: "+a.length());
	//length = verifica o numero de caracteres.
	System.out.println("equals: "+a.equals("boa tarde"));
	// equals = verifica se o valor informado é v ou f.
	System.out.println("equalsIgnoreCase"+a.equalsIgnoreCase("BoA tARde\n"));
	// equalsIgnoreCase = verifica se o valor informado é verdadeiro ou falso ignorando se é maiusculo ou minusculo.
	
	var nome = "tadeu";
	var sobrenome = "abreu";
	var idade = 38;
	var salario = 11.000;
	
	System.out.println("Nome: "+ nome +"\nSobrenome: "+ sobrenome + "\nidade:" + idade + "\nsalario" + salario);
	System.out.printf("O senhor %s %s tem %d anos e ganha R$%.3f",
	nome, sobrenome, idade, salario);
	//%s = seleciona uma string
	//%d seleciona a variavel int
	//%. seleciona um inteiro,float,double etc.
	String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.3f",
			nome, sobrenome, idade, salario);
	System.out.println(frase);
	}
}
