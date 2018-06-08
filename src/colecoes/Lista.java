package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println("Get...");
		System.out.println(aprovados.get(1)); // COnsigo acessar pelo indice
		
		System.out.println("Add...");
		System.out.println(aprovados.add("Maria")); // Ao contr�rio do Set o List aceito elementos iguais
		System.out.println("Size... " + aprovados.size());
		
		System.out.println("Remove...");
		System.out.println(aprovados.remove("maria"));
		System.out.println(aprovados.remove("Maria")); // Ele elimina a primeira Maria que foi criada da linha 13
		System.out.println("Size... " + aprovados.size());
		
		for (String nome: aprovados) {
			System.out.println(nome);
		}
	}

}
