package oo.heranca;

public class Ferrari extends Carro {
	
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350; // n�o precisa nem especificar o tipo, j� � herdado.
	}
	
	public void acelerar() {
		// Se o m�todo da classe pai se chamasse acelerar tamb�m, o super serve pra fazer essa distin��o.
		super.acelerarMais(20);
	}

}
