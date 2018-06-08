package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> aprovados = new HashMap<>();
		
		aprovados.put(1, "Pedro"); // O put serve para adicionar ou substituir caso já exista um registro com mesma chave
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		System.out.println(aprovados.keySet()); // Obtendo o conjunto de chaves [1, 2, 3, 4]
		System.out.println(aprovados.values()); // Obtendo os valores
		System.out.println(aprovados.entrySet()); // Conjunto do próprio registro completo
		
		aprovados.put(3, "Beatriz"); // Sustituindo um valor através do put
		System.out.println(aprovados.get(3)); // Pegando um valor através da chave e não do indice
		
		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("Bia"));
		
		System.out.println("Chaves...");
		for (Integer codigo: aprovados.keySet()) {
			System.out.println(codigo);
		}
		
		System.out.println("Valores...");
		for (String nome: aprovados.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Chaves/Valores");
		for (Entry<Integer, String> registro : aprovados.entrySet()) { // Entry é um tipo especifico do Map que pega chave e valor
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
		
		// Chamada do método para obter uma chave através de um valor
		System.out.println(getKeyByValue(aprovados,"Carlos"));
		
		
	}
	
	// Método para obter uma chave através de um valor
	public static <K, V> K getKeyByValue(Map<K, V> map, V value) {

	    for (Entry<K, V> entry : map.entrySet()) {

	        if (value.equals(entry.getValue())) {
	            return entry.getKey();
	        }
	    }

	    return null;
	}

}
