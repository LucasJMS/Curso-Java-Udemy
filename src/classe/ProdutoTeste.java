package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
			
		Produto produto1 = new Produto();
		produto1.nome = "Notebook Acer 15'";
		produto1.preco = 2500;
		
		Produto produto2 = new Produto("Caneta BIC Preta", 2.85);
			
		// Esse desconto é uma variável de classe modificado pela palavra static e se aplica a todos os produtos
		// Caso não fosse definido assim para cada produto eu teria que digitar "produto.desconto" ou new Produto(..., ..., valor do desconto)
		Produto.desconto = 0.5;
		
		System.out.println(produto1.obterDesconto());
		System.out.println(produto2.obterDesconto());
	}
}
