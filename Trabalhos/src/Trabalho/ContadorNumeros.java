package Trabalho;

import java.util.Scanner;

public class ContadorNumeros {

	public static void main(String[] args) {

		int vInicial, vFinal, i;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor inicial da contagem");
		vInicial = entrada.nextInt();

		System.out.println("Informe o valor final da contagem");
		vFinal = entrada.nextInt();

		for (i = vInicial; i <= vFinal; i++) {
			System.out.printf("\n Contagem: %d", i);

			entrada.close();
		}

	}
}