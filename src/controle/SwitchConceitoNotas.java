package controle;

public class SwitchConceitoNotas {
	
	public static void main(String[] args) {
		
		String conceito = "";
		int nota = 10;
		
		switch(nota){
			case 10: case 9: conceito = "A"; break;
			case 8: case 7: conceito = "B"; break;
			case 6: case 5: conceito = "C"; break;
			case 4: case 3: conceito = "D"; break;
			case 2: case 1: case 0: conceito = "E"; break;
			default: conceito = null;
			/* null significa nulo. 
			 * Você compara nulo quando você sabe que uma variável 
			 * tem a chance de possivelmente não trazer nada.*/
		}
		
		if (conceito != null) {
			System.out.println("Conceito " + conceito);
		} else {
			System.out.println("Nota inválida");
		}
		
	}

}
