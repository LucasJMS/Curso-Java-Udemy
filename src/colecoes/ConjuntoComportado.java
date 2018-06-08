package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
						
		Set<String> aprovados = new HashSet<>(); // N�o mostra na ordem
		// Set<String> aprovados = new LinkedHashSet<>(); // Mostra na ordem em que foram adicionados
		// Set<String> aprovados = new TreeSet<>(); // Mostra em ordem alfab�tica
		aprovados.add("Jo�o");
		aprovados.add("Maria");
		aprovados.add("Pedro");
		aprovados.add("Carlos");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}
}
