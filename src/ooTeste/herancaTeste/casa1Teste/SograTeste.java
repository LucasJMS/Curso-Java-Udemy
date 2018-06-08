package ooTeste.herancaTeste.casa1Teste;

public class SograTeste{
	
	protected String segredoFamilia = "Temos uma conta na suiça";
	
	public static void main(String[] args) {
		
		SograTeste sograMaravilhosa = new SograTeste();
		System.out.println(sograMaravilhosa.segredoFamilia);
		
//		FilhaTeste filhinha = new FilhaTeste();
//		System.out.println(filhinha.segredoCasal);
		
// 		Não consegue acessar pq a visibilidade do atributo segredoCasal é protected e só enxerga quem está no 
//      mesmo pacote ou então por herança.


	}

}
