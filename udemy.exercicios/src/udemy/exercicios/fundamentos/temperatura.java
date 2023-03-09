package udemy.exercicios.fundamentos;

public class temperatura {

    public static void main(String[] args) {
        // (°F - 32) * 5/9 = °C

        double F = 86;
        final int ajuste = 32;
        final double fator = 5.0 / 9.0;
        double C = (F - ajuste) * fator;
        
        System.out.println("O resultado é " + C +"°C");
        
        F = 150;
        C = (F - ajuste) * fator;
        System.out.println("O resultado é " + C +"°C");

    }
    
}