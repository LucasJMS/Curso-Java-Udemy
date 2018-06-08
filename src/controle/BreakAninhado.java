package controle;

public class BreakAninhado {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 2) {
					break; /* Com esse break ele sai do for interno e vai para
					o for externo..A saída vai ser imprimida da seguinte maneira:
					0 0
					0 1
					1 0
					1 1
					2 0
					2 1*/
				}

				System.out.println(i + " " + j);
			}
		}
		System.out.println("Fim");
	}

}
