package udemy.exercicios.controle;

import javax.swing.JOptionPane;

public class estruturaIfElse {
	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		int numero = Integer.parseInt(valor);

		// Ao inves de fazer 2 estruturas if

		if (numero % 2 == 0) {
			System.out.println("Numero par!");

			if (numero % 2 == 1) {
				System.out.println("Numero impar!");

			}
			// Utiliza-se if/else

			if (numero % 2 == 0)
				System.out.println("Numero par!");

			else {
				System.out.println("Numero impar!");
			}
		}

	}
}
