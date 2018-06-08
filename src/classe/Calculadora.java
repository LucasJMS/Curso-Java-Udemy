package classe;

public class Calculadora {
	
	double resultado;
	
	// Método que tem retorno e recebe parâmetro.
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// Método que não tem retorno e recebe parâmetro.
	void acrescentar(double a) {
		resultado += a;
	}
	
	// Método que tem retorno e não recebe parâmetro.
	double obterResultado() {
		return resultado;
	}
	
	// Método que não tem retorno e nem recebe parâmetro.
	void limpar() {
		resultado = 0;
	}

}
