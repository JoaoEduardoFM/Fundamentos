package fundamentos.Operadores;

public class Unarios {
	
	public static void main(String[] args) {	
	
	
	int a = 1;
	int b = 2;
	
	a++; //a = a + 1
    a--; //a = a - 1
    
    b++; //b = b + 1
    b--; //b = b - 1
    
  System.out.println(a);
  System.out.println(b);
  
  System.out.println("Mini desafio");
  System.out.println(++a == b--); //++a tem prioridade de soma depois é feita a comparacao com b--
  System.out.println(a++ == b--);
  System.out.println(a);
  System.out.println(b);
}
}
