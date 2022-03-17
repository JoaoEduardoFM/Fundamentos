package fundamentos.Operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
        boolean trabalho2 = false;
		
		
		boolean comproutv50 = trabalho1 && trabalho2;//e
		boolean comproutv32 = trabalho1 ^ trabalho2;//ou exclusivo
		boolean comprouSorvete= trabalho1 ||  trabalho2; //ou
		
		//operador unario
		boolean maisSaudavel = !comprouSorvete;//negacao
		
		System.out.println("Comprou TV50? "+comproutv50);
		System.out.println("Comprou TV32? "+comproutv32);
		System.out.println("Comprou sorvete? "+comprouSorvete);
		
		System.out.println("Mais saudavel? "+ maisSaudavel);
	}

}
