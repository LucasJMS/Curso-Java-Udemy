package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		// Trabalhando com o Construtor padr�o
		Data nascimento = new Data();
		
		//nascimento.dia = 21;
		//nascimento.mes = 9;
		//nascimento.ano = 92;
		
		// Trabalhando com o Construtor com par�metros
		Data casamento = new Data(10, 10, 2010);
		
		System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
		
		// E se eu criasse um m�todo pra formatar essa sa�da da Data....
		
		System.out.println();
		System.out.println(nascimento.formatar());
		System.out.printf(casamento.formatar());
		
		// Para fazer novamente � s� chamar o m�todo formatar
		
	}
}
