package ooTeste.polimorfismoTeste;

public class ComidaTeste {
	
	private double peso = 0;
	
	public double getPeso(){
		return peso;
	}
	
	public void setPeso(double peso){
		if(peso > 0){
			this.peso = peso;
		}
	}

//	private double peso = 0;
//	
//	public double getPeso(){
//		return peso;
//	}
//	
//	public void setPeso(double peso){
//		if(peso > 0){ // Uma valida��o para garantir que n�o vai ser colocado peso negativo.
//			this.peso = peso;
//		}
//	}
}
