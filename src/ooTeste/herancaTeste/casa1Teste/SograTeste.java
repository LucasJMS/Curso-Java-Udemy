package ooTeste.herancaTeste.casa1Teste;

public class SograTeste{
	
	protected String segredoFamilia = "Temos uma conta na sui�a";
	
	public static void main(String[] args) {
		
		SograTeste sograMaravilhosa = new SograTeste();
		System.out.println(sograMaravilhosa.segredoFamilia);
		
//		FilhaTeste filhinha = new FilhaTeste();
//		System.out.println(filhinha.segredoCasal);
		
// 		N�o consegue acessar pq a visibilidade do atributo segredoCasal � protected e s� enxerga quem est� no 
//      mesmo pacote ou ent�o por heran�a.


	}

}
