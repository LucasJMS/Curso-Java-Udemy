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
		Produto produto2 = produto; // Uma outra vari�vel est� apontando pra mesma referencia de produto
		produto2.nome = "L�pis"; // Mesmo com final o nome � mudado, pq o final deixa constante a referencia
		
		// Com o "final" eu n�o posso fazer isso: produto = new Produto();
		// Sem o final eu posso fazer isso: produto = new Produto();
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero); /* Essa variavel est� recebendo uma atribui��o por valor e uma c�pia desse valor 
		� atribuida ao metodo porValor */
		
		System.out.println(produto.preco); /* Aqui � passado uma referencia de um endere�o na mem�ria de onde 
		o objeto est� */
		
		System.out.println(produto.nome); /* Ele n�o imprime Caneta porque a variavel produto2 aponta para mesma 
		referencia e alterou para L�pis */
		
	}

}
