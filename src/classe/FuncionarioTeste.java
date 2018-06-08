package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
				
		Funcionario construtorPadrao = new Funcionario();
		
		construtorPadrao.nome = "Juares";
		construtorPadrao.funcao = "Vendedor";
		construtorPadrao.salario = 1200;
		
		System.out.println("Nome do funcionário: " + construtorPadrao.nome);
		System.out.println("Função: " + construtorPadrao.funcao);
		System.out.println("Salário: " + construtorPadrao.salario);
		
		Funcionario comParametro = new Funcionario("Arlindo", "Florista", 1000);
	
		System.out.println("Nome do funcionário: " + comParametro.nome);
		System.out.println("Função: " + comParametro.funcao);
		System.out.println("Salário: " + comParametro.formatar());
	}
}
