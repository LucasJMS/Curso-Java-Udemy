package classe;

public class ValorVsReferencia {
	
	static void porValor(double numero) {
		numero++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		final Produto produto = new Produto("Caneta", 1);
		Produto produto2 = produto; // Uma outra variável está apontando pra mesma referencia de produto
		produto2.nome = "Lápis"; // Mesmo com final o nome é mudado, pq o final deixa constante a referencia
		
		// Com o "final" eu não posso fazer isso: produto = new Produto();
		// Sem o final eu posso fazer isso: produto = new Produto();
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero); /* Essa variavel está recebendo uma atribuição por valor e uma cópia desse valor 
		é atribuida ao metodo porValor */
		
		System.out.println(produto.preco); /* Aqui é passado uma referencia de um endereço na memória de onde 
		o objeto está */
		
		System.out.println(produto.nome); /* Ele não imprime Caneta porque a variavel produto2 aponta para mesma 
		referencia e alterou para Lápis */
		
	}

}
