package ooTeste.herancaTeste.casa2Teste;

import ooTeste.herancaTeste.casa1Teste.SogroTeste;

public class GenroTeste {
	
	private String meuSegredo = "N�o gosto da minha sogra";
	
	public static void main(String[] args) {
		
		GenroTeste euMesmo = new GenroTeste();
		System.out.println(euMesmo.meuSegredo);
		
		FilhaTeste meuAmor = new FilhaTeste();
		System.out.println(meuAmor.segredoCasal);
		
		SogroTeste sograo = new SogroTeste();
		System.out.println(sograo.gostaDeCerveja);
		
//      SograTeste sogrinha = new SograTeste();
//      System.out.println(sogrinha.segredoFamilia);

//		S� receberia essa informa��o se a Sogra tivesse no mesmo pacote ou se eu herdasse da Sogra. Isso tudo
//		poque o nivel de visibilidade dela � protected.
		
		
	}

}
