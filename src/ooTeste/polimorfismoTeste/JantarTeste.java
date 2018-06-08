package ooTeste.polimorfismoTeste;

public class JantarTeste {

	public static void main(String[] args) {
		
	PessoaTeste pessoa = new PessoaTeste(80);
	
	Macarrao macarrao = new Macarrao();
	macarrao.setPeso(0.5);
	
	Frango frango = new Frango();
	frango.setPeso(0.5);
	
	Chocolate chocolate = new Chocolate();
	chocolate.setPeso(0.5);
	
	pessoa.comer(macarrao);
	pessoa.comer(frango);
	/* pessoa.comer(chocolate);...Isso da erro porque sem o polimorfismo dinâmico eu tenho que criar o método comer 
	 para cada alimento. Para dar certo é só criar um método em que o parametro vem da classe mãe*/
	pessoa.comer(chocolate);
	
	System.out.println(pessoa.getPeso());
		

		
		
//		Macarrao macarrao = new Macarrao();
//		macarrao.setPeso(0.250);
//		
//		Frango frango = new Frango();
//		frango.setPeso(0.300);
//		
//		Chocolate chocolate = new Chocolate();
//		chocolate.setPeso(0.700);
//		
//		PessoaTeste pessoa = new PessoaTeste(80);
//		pessoa.comer(macarrao);
//		pessoa.comer(frango);	
//		//pessoa.comer(chocolate);
//		
//		System.out.println(pessoa.getPeso());
	}
}
