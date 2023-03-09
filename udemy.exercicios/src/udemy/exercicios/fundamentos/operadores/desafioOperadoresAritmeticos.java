package udemy.exercicios.fundamentos.operadores;

public class desafioOperadoresAritmeticos {
	public static void main(String[] args) {
		
		double a1 =  (6 *(3 + 2));
		double a2 = Math.pow(a1, 2);
		double a3 =  3*2;
		double a4 = a2 / a3;
		
		double b1 = (1-5) * (2-7) / 2;
		double b2 =  Math.pow(b1, 2);
		
		double c1 = a4 - b2;
		double c2 =  Math.pow(c1, 3);
		
		double d =  Math.pow(10, 3);
		
		double resultado = c2 / d;
		System.out.println("O resultado e: " + resultado);
		
			
		
		
		
	}
	
	
}
