package oo.heranca;

public class Ferrari extends Carro {
	
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350; // não precisa nem especificar o tipo, já é herdado.
	}
	
	public void acelerar() {
		// Se o método da classe pai se chamasse acelerar também, o super serve pra fazer essa distinção.
		super.acelerarMais(20);
	}

}
