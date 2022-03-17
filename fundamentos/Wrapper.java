package fundamentos;

import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte  b = 100;
		Short s = 1000;
		
		Integer i = Integer.parseInt(entrada.next());
		Long l = 100000L;
		Float f = 123.0F;
		Double d = 123.456;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c ='#';
		System.out.println(c + "...");
		entrada.close();
		
	}
	

}
