package TrabalhoException;

import java.util.Scanner;

public class TrabAulaTryException {

	public static void main(String[] args) {

		System.out.println("Digite '0' para o SUCESSO! :)");

		try {
			int num = mExcecao();

			System.out.println("Nice boys, Sucesso :)");
		} catch (Exception e) {
			System.out.println("Problemas com a execução: " + e.getMessage());
			// e.printStackTrace();

		}
	}

	public static int mExcecao() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num != 0) {
			throw new TrabMinhaExcecao("Você digitou algo diferente de '0' sorry my friend :");
		}
		return num;

	}

}
