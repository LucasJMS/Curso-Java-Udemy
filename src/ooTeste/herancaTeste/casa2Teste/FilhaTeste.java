package ooTeste.herancaTeste.casa2Teste;

import ooTeste.herancaTeste.casa1Teste.SograTeste;
import ooTeste.herancaTeste.casa1Teste.SogroTeste;

public class FilhaTeste extends SograTeste {

	String segredoCasal = "Meu marido est� quase sendo demitido";
	
	public static void main(String[] args) {
		
		FilhaTeste euMesma = new FilhaTeste();
		System.out.println(euMesma.segredoCasal);
		
//		GenroTeste maridao = new GenroTeste();
//		System.out.println(maridao.meuSegredo);
		
//      Mesmo estando no mesmo pacote n�o consegue acessar porque o atributo � private
		
		SogroTeste papai = new SogroTeste();
		System.out.println(papai.gostaDeCerveja);
		
//		SograTeste mamae = new SograTeste();
//		System.out.println(mamae.segredoFamilia);
		
//		N�o precisa criar uma instancia da classe pai para acessar esse atributo. A forma correta seria...
		System.out.println(euMesma.segredoFamilia);
	}
}
