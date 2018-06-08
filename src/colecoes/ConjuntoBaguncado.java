package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	public static void main(String[] args) {
		
		Set conjunto = new HashSet();
		
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1)); // Vai imprimir false pq já existe o elemento e ele não repete
		System.out.println(conjunto.add(10)); // Vai retornar true pq não existe dentro do conjunto
		System.out.println("Size... " + conjunto.size()); // Vai retornar o numero de elementos do conjunto. No caso, 6
		
		System.out.println("Remove...");
		System.out.println(conjunto.remove("a")); // Vai retornar false pq esse a é uma String
		System.out.println(conjunto.remove('a'));
		System.out.println("Size... " + conjunto.size());
		
		System.out.println("Contains...");
		System.out.println(conjunto.contains('a')); // Vai retornar false pq o elemento foi removido na linha 25
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		
		// conjunto.addAll(nums); -> Nesse caso estou adicionando todos os elementos de um conjunto no outro
		conjunto.retainAll(nums); // Vai mostrar a intersecção
		
		System.out.println("Size...");
		System.out.println(conjunto.size());
		
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
		
	}

}
