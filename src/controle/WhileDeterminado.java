package controle;

import java.util.Scanner;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota = 0;
		double somaNota = 0;
		int indice = 0;
		
		while (indice < 3) {
			nota = scan.nextDouble();
			somaNota += nota;
			indice++;
		}
		
		scan.close();
		System.out.printf("A média é %.2f", somaNota / 3);
	}

}
