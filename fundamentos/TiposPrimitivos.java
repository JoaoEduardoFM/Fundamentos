package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//informacoes de funcionarios
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 4_234_845_223L;
		
		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = true; // false
		
		// tipo caractere
		char status = 'A'; //Ativo 
		
		// dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// numeros de viagens
		System.out.println("Numero de viagens: "+numeroDeVoos / 2);
		
		// Pontos acumulados
		System.out.println("Para cada venda o vendedor ganha: " +pontosAcumulados / vendasAcumuladas + "de milhas por venda");
		
		// quanto o id ganha de salario
		System.out.println("O Id: "+ id + " ganha -> " + salario + " reais");
		
		//esta de ferias
		System.out.println("Esta de ferias? "+ estaDeFerias);
		
		System.out.println("Status: " + status);
		
	}

}
