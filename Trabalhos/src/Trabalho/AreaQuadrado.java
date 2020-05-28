package Trabalho;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {

		float base, altura, area;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a altura do quadrado: ");
		base = entrada.nextFloat();

		System.out.println("Informe a base do quadrado: ");
		altura = entrada.nextFloat();

		area = (base * altura);

		System.out.printf("A área do quadrado eh: %.1f ", area);
		entrada.close();
	}
}
