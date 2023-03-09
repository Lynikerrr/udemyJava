package udemy.exercicios.fundamentos;

import java.util.Scanner;

public class desafioCalculadora {
	public static void main(String[] args) {
		//ler num1
		//ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite o operador desejado: ");
		String op = entrada.next();
		
		//Logica do calculo 
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		
		entrada.close();
	}
	
	
}
