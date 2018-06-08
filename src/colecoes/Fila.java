package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("João");
		fila.offer("Pedro");
		fila.add("Maria"); //offer e add fazem praticamente e mesma coisa a diferença é que se der um erro
		// offer retorna null e add retorna um erro
		
		System.out.println("Peek/Element...");
		System.out.println(fila.peek()); // Mostra o primeiro elemento da fila
		System.out.println(fila.element()); // Se ñ tiver elemento peek retorna null e element um erro
		
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll()); // Mostra e remove o primeiro elemento da fila
		System.out.println(fila.remove()); // Se ñ tiver elemento poll retorna null e remove um erro
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove());
		
	}

}
