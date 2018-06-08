package classe;

public class Funcionario {

	String nome;
	String funcao;
	double salario;
	
	Funcionario() {
		
	}
	
	Funcionario(String Nome, String Funcao, double Salario) {
		nome = Nome;
		funcao = Funcao;
		salario = Salario;
	}
	
	String formatar() {
		return String.format("%.2f", salario);
	}

}
