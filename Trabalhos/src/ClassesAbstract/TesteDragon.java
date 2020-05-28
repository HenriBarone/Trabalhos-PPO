package ClassesAbstract;

import java.util.Scanner;

public class TesteDragon {

	public static void main(String[] args) {

		int tipo;
		Dragon elementalDragon;

		Scanner entrada = new Scanner(System.in);
		System.out.println("--/-- ESCOLHA O ELEMENTO DO DRAGÃO --/--");
		System.out.println("Digite '1' paro escolher o elemento de 'FOGO' ou '2' para 'ÁGUA'");
		tipo = entrada.nextInt();

		if (tipo == 1) {
			elementalDragon = new FireDragon();
			elementalDragon.dragonElement();
		} else {
			elementalDragon = new WaterDragon();
			elementalDragon.dragonElement();
		}
		entrada.close();
	}

}
