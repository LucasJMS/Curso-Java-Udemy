package api;

public class ExplorandoString {

	public static void main(String[] args) {
		
		//String nome = new String("Lucas");
		/* Não precisa declarar dessa forma acime porque a API do Java já reconhece e faz todo o trabalho*/
		
		String nome = "Lucas";
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.charAt(1));
		System.out.println(nome.length());
		System.out.println(nome.equalsIgnoreCase("LuCaS"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.startsWith("Lu"));
		System.out.println();
		System.out.println(nome);
		
		/* A String continua sendo Lucas, para modificar tem que se atribuir modificações a ela...*/ 
		nome = nome.toUpperCase() + " tem " + nome.length() + " letras.";
		System.out.println(nome);
	}
	
	
}
