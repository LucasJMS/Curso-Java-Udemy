package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
				
		Funcionario construtorPadrao = new Funcionario();
		
		construtorPadrao.nome = "Juares";
		construtorPadrao.funcao = "Vendedor";
		construtorPadrao.salario = 1200;
		
		System.out.println("Nome do funcion�rio: " + construtorPadrao.nome);
		System.out.println("Fun��o: " + construtorPadrao.funcao);
		System.out.println("Sal�rio: " + construtorPadrao.salario);
		
		Funcionario comParametro = new Funcionario("Arlindo", "Florista", 1000);
	
		System.out.println("Nome do funcion�rio: " + comParametro.nome);
		System.out.println("Fun��o: " + comParametro.funcao);
		System.out.println("Sal�rio: " + comParametro.formatar());
	}
}
