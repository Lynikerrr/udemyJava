package udemy.exercicios.fundamentos.operadores;

public class desafioOperadoresLogicos {
	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean comprou50 = trab1 && trab2;
		System.out.println("Comprou a Tv de 50\"? " + comprou50);
		
		boolean comprou32 = trab1 ^ trab2;
		System.out.println("Comprou a Tv de 32\"? " + comprou32);
		
		
		//Operador unario 
		boolean comprouSorvete = trab1 || trab2;
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel? " + !comprouSorvete);
		
	}
	
	
}
