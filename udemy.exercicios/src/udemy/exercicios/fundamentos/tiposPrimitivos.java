package udemy.exercicios.fundamentos;

public class tiposPrimitivos {
	public class tiposPrimitivos2 {
	    public static void main(String[] args) {
	        // Informações do funcionario

	        // Tipos numericos inteiros
	        byte anosDeEmpresa = 23;
	        short numeroDeVoos = 542;
	        int id = 56789;
	        long pontosAcumulados = 3_234_845_223L;

	        // Tipos numericos reais
	        float salario = 11_445.44F;
	        double vendasAcumuladas = 2_991_797_103.01;

	        // Tipo booleano
	        boolean estaDeFerias = false; // ou true

	        // Tipo caractere
	        char status = 'a'; // ativo (Tipo char aceita apenas uma letra entre aspas simples)

	        // Dias de empresa

	        System.out.println(anosDeEmpresa * 365);

	        // Numero de viagens
	        System.out.println(numeroDeVoos / 2);

	        // Pontos por real

	        System.out.println(pontosAcumulados / vendasAcumuladas);

	        // Salario do funcionario

	        System.out.println(id + " ganha -> " + salario);

	        // Status das ferias

	        System.out.println("Ferias? " + estaDeFerias);

	        // Status de atividade 

	        System.out.println("Status: " + status);
	        

	    }
	}

}
