package fundamentos.Operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a==b);//== comparacao
		System.out.println(3 > 4); //maior
		System.out.println(3 < 7); //menor
		System.out.println(30 <= 7); //menor igual
		System.out.println(30 != 7); //diferente
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouMedia = nota >= 7;
		boolean temdesconto = bomComportamento && passouMedia;
		
		System.out.println("Tem desconto ?"+ temdesconto);
	}
}
