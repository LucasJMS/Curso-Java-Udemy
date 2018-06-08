package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// Uma classe pode ter mais de um construtor
	Data() {
		this(1, 1, 2017); // O this com parênteses representa um dos
							// construtores da sua própria classe
	}

	// Como esse construtor recebe parametros, ele não é um construtor padrão
	Data(int dia, int mes, int ano) {
		this.dia = dia; // O this faz referência as atributos da própria classe,
						// que é o seu objeto
		this.mes = mes;
		this.ano = ano;
	}

	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
