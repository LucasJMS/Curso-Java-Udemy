package controle;

public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue; /* O continue n�o faz ele sair do la�o com o break, mas
				pular pra p�roxima itera��o*/
			}

			System.out.println(i);
		}

		System.out.println("Fim");
	}
}


