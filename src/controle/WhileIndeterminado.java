package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double nota = 0;
		double somaNotas = 0;
		int contagemNotas = 0;

		while (nota != -1) {
			nota = scan.nextDouble();

			if (nota <= 10 && nota >= 0) {
				
				somaNotas += nota;
				contagemNotas++;
			}

		}

		scan.close();

		System.out.printf("A Média é %.2f", somaNotas / contagemNotas);

	}

}
