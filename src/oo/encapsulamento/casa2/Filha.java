package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

// extends = se-lê Filha herda da Sogra.
public class Filha extends Sogra{
	
	// Quando não tem nenhum modificador antes do tipo da variável, ele assume como default
	String segredoDoCasal = "Meu marido está quase sendo demitido.";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem... " + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia); /* Consegue acessar porque herdou da Sogra, mesmo estando em
		pacotes diferentes...E aí como Filha herdou, o atributo é chamada na própria classe Filha.*/
		
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		// COmo a filha está herdando, tem que chamar pela instância da Filha
		//Sogra mamae = new Sogra();
		//System.out.println(mamae.segredoDeFamilia);
	}

}
