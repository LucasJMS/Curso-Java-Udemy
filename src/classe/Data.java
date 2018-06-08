package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// Uma classe pode ter mais de um construtor
	Data() {
		this(1, 1, 2017); // O this com par�nteses representa um dos
							// construtores da sua pr�pria classe
	}

	// Como esse construtor recebe parametros, ele n�o � um construtor padr�o
	Data(int dia, int mes, int ano) {
		this.dia = dia; // O this faz refer�ncia as atributos da pr�pria classe,
						// que � o seu objeto
		this.mes = mes;
		this.ano = ano;
	}

	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
