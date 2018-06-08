package ooTeste.polimorfismoTeste;

public class PessoaTeste {
	
	private double peso = 0;
	
	public PessoaTeste(double pesoInicial){
		this.peso = pesoInicial;
	}
	
	public double getPeso(){
		return peso;
	}
	
	
	/* Usando a classe mais genérica como parametro, independente do alimento que for criado, vai ter só um método 
	 * comer, desde que esse novo alimento estenda a classe ComidaTeste*/
	public void comer(ComidaTeste comida){
		this.peso += comida.getPeso();
	}
	
	
	
//	private double peso = 0;
//	
//	public PessoaTeste(double pesoInicial){
//		this.peso = pesoInicial;
//	}
//	
//	public double getPeso(){
//		return peso;
//	}
//	
//	public void comer(Macarrao macarrao){
//		this.peso += macarrao.getPeso();
//	}
//	
//	public void comer(Frango frango){
//		this.peso += frango.getPeso();
//	}

}
