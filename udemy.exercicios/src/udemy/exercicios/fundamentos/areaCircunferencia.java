package udemy.exercicios.fundamentos;

public class areaCircunferencia {
    
    public static void main(String[] args) {
    
        int raio = 3;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println("area= " + area + "m2.");

    }
}
