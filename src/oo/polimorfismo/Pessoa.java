package oo.polimorfismo;

public class Pessoa {
	
	
	/**
	 * Peso em Kg
	 */
	private double peso = 0;
	
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	public double getPeso(){
		return peso;
	}
	
	// Polimorfismo Estático (Sobrecarga de método) - Mesmo nome e dois atributos diferentes
	/*public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}*/
	
	
	// Vamos supor que para implementar o Sorvete ou qualquer nova comida, tenho que criar um método comer para ela
	/*public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}*/
	
	// Polimorfismo Dinâmico
	// Agrega de valor que agora é simplismente eu trocar por isso, que posso chamar qualquer alimento que herde de comida.
	public void comer(Comida... comidas) {
		for(Comida c: comidas){
			this.peso += c.getPeso();
		}
		
	}

}
