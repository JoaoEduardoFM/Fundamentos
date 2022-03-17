package fundamentos.Operadores;

public class Aritimeticos {
	
	public static void main(String[] args) {
		
		System.out.println(5+3);
		
		var x = 35.40;
		double y = 17.63;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		int a = 15;
		int b = 17;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/(double)b);//conversao de numero inteiro para double.CAST
		
		System.out.println(a % b);//resto da divisao
		System.out.println(8 % 4);//resto da divisao
		
		System.out.println(a + b - a * b);
	}

}
