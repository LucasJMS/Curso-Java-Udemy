package colecoes;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
		
		pilha.push("O Pequeno Pr�ncipe");
		pilha.push("O Hobbit");
		pilha.push("Dom Quixote");
		
		System.out.println("Peek...");
		System.out.println(pilha.peek()); // No caso da pilha sempre retorna o ultimo a entrar
		
		System.out.println("Pop...");
		System.out.println(pilha.pop()); // Mostra e retira o �ltimo da pilha
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop());
		
		
	}

}
