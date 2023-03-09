package udemy.exercicios.fundamentos;

public class inferencia{
    
    public static void main(String[] args) {
        
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";    //tipo da variavel nao foi definido, porem ao inserir o valor, o java infere e define o tipo automaticamente
        System.out.println(c);
        // c = 5.0;   nao pode aplicar pois o java inferiu que o tipo da variavel var só recebe valor de texto 

        c = "Outro texto";
        System.out.println(c);

        double d;   //variavel foi declarada
        d = 123.65;     //variavel foi inicializada
        System.out.println(d);    // variavel foi usada


    }

}