package fundamentos.Operadores;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// ler num1
		//ler num2
		// + - * / %
		String valor1 = JOptionPane.showInputDialog("informe o primeiro valor.");
		String valor2 = JOptionPane.showInputDialog("informe o segundo valor.");
		String op =  JOptionPane.showInputDialog("informe a operação.( + - * / % )"); 
        
		double numero1 = Double.parseDouble(valor1);// converte string para double
		double numero2 = Double.parseDouble(valor2);// converte string para double
		
		//logica.
		double resultado = "+".equals(op) ? numero1 + numero2 : 0; //logica de + 
		resultado = "-".equals(op) ? numero1 - numero2 : resultado;//logica de -
		resultado = "*".equals(op) ? numero1 * numero2 : resultado;//logica de *
		resultado = "/".equals(op) ? numero1 / numero2 : resultado;//logica de /
		resultado = "%".equals(op) ? numero1 % numero2 : resultado;//logica de % = impar ou par
		
		System.out.println("O valor da operação é: "+ resultado);
	}
}
