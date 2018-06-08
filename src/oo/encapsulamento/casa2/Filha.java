package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

// extends = se-l� Filha herda da Sogra.
public class Filha extends Sogra{
	
	// Quando n�o tem nenhum modificador antes do tipo da vari�vel, ele assume como default
	String segredoDoCasal = "Meu marido est� quase sendo demitido.";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem... " + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia); /* Consegue acessar porque herdou da Sogra, mesmo estando em
		pacotes diferentes...E a� como Filha herdou, o atributo � chamada na pr�pria classe Filha.*/
		
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		// COmo a filha est� herdando, tem que chamar pela inst�ncia da Filha
		//Sogra mamae = new Sogra();
		//System.out.println(mamae.segredoDeFamilia);
	}

}
