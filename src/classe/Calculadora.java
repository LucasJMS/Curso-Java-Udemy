package classe;

public class Calculadora {
	
	double resultado;
	
	// M�todo que tem retorno e recebe par�metro.
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// M�todo que n�o tem retorno e recebe par�metro.
	void acrescentar(double a) {
		resultado += a;
	}
	
	// M�todo que tem retorno e n�o recebe par�metro.
	double obterResultado() {
		return resultado;
	}
	
	// M�todo que n�o tem retorno e nem recebe par�metro.
	void limpar() {
		resultado = 0;
	}

}
