package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		
		double raioCircunfer�ncia = 4.5;
		final double PI = 3.1416;
		double area = PI * raioCircunfer�ncia * raioCircunfer�ncia;
		
		System.out.println("�rea � " + area + " m2.");
		System.out.printf("�rea � %f m2.\n" , area);
		System.out.printf("�rea � %.2f m2." , area);
		
	}

}

/* O atalho ctrl+1 altera o identificador de uma vari�vel existente e passa
 * para outras vari�veis no c�digo que tinham o mesmo nome.
*/