package colecoes;

public class EnderecoTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "1001");
		System.out.println(endereco1 == endereco2); /* Retorna false pq como são duas instâncias, está se comparando 
		dois endereços de memórias*/
		System.out.println(endereco1.equals(endereco2)); /* Retorna false porque está pegando o equals da classe Object
		que faz a mesma coisa do ==...Para compararos valores tem um atalho para gerar HashCode e Equals que deve ser
		feito na classe Endereco no caso*/
	}
}
