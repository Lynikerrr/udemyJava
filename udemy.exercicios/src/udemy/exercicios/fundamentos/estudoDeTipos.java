package udemy.exercicios.fundamentos;

public class estudoDeTipos{

    public static void main(String[] args) {
        
        // Estudo dos tipos baseado em uma empresa

        byte numeroFranquias = 17;
        short numeroFuncionarios = 137;
        int salarioProducao = 1604;
        long faturamentoAnual = 3_204_480_588L;

        float faturamentoMensal = 264_648_054F;
        double faturamentoFranquias = 1_587_888_326.80;

        boolean metaBatida = false;
        char classificacao = 'A';
        
        System.out.println("A empresa X é composta por " + numeroFranquias + " franquias e sua sede.");
        System.out.println("\nAtualmente possui " + numeroFuncionarios + " no setor da produção, que tem o salario de R$ " + salarioProducao + " por mês.");
        System.out.println("\n No ultimo ano, o faturamento resgistrado foi de " + faturamentoAnual + ". E até o mes 6 desse ano as franquias faturaram um total de " + faturamentoFranquias);
        System.out.println("\n Isso significa que cada franquia faturou aproximadamente " + faturamentoMensal + "por mes!");
        System.out.println("\n A meta ainda nao foi alcançada, mas tudo indica que irá ser batida.");
        System.out.println("\n Status da meta: " + metaBatida);
        System.out.println("\n Classificação da empresa: " + classificacao);
        

    }

}