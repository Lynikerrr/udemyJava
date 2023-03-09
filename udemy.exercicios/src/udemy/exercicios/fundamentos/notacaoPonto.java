package udemy.exercicios.fundamentos;

public class notacaoPonto {
	
	public static void main(String[] args) {
	     
	    double a = 2.3;
	    String s = "Bom dia X";
	    s = s.toUpperCase();

	    s = s.replace("X", "Senhora");

	    s = s.concat("!!!!");

	    System.out.println(s);

	    String x = "Lyniker".toUpperCase();
	    System.out.println(x);

	    String y = "Bom dia X"
	        .replace("X", "Ana")
	        .toUpperCase()
	        .concat("!!!");
	    System.out.println(y);

	    // Tipos primitivos não tem o operador "."
	    System.out.println(a);
	}
	
}
