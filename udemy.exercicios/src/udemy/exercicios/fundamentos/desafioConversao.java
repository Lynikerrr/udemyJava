package udemy.exercicios.fundamentos;

import java.util.Scanner;

public class desafioConversao {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe o primeiro salario: ");
	String salario1 = entrada.next().replace(",", ".");
	System.out.print("\nInforme o segundo salario: ");
	String salario2 = entrada.next().replace(",", ".");
	System.out.print("\nInforme o terceiro salario: ");
	String salario3 = entrada.next().replace(",", ".");
	
	double s1 = Double.parseDouble(salario1);
	double s2 = Double.parseDouble(salario2);
	double s3 = Double.parseDouble(salario3);
	
	double media = (s1 + s2 + s3) / 3;
	
	System.out.println("A media salarial dos ultimos 3 meses é de: R$" + media);
	
	entrada.close();
			
		
		
	}
	
}
