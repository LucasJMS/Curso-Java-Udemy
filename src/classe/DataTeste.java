package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		// Trabalhando com o Construtor padrão
		Data nascimento = new Data();
		
		//nascimento.dia = 21;
		//nascimento.mes = 9;
		//nascimento.ano = 92;
		
		// Trabalhando com o Construtor com parâmetros
		Data casamento = new Data(10, 10, 2010);
		
		System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
		
		// E se eu criasse um método pra formatar essa saída da Data....
		
		System.out.println();
		System.out.println(nascimento.formatar());
		System.out.printf(casamento.formatar());
		
		// Para fazer novamente é só chamar o método formatar
		
	}
}
