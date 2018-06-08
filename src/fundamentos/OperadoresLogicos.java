package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean valor1 = true;
		boolean valor2 = false;
		
		System.out.println(valor1 && valor2);
		System.out.println(valor1 || valor2);
		System.out.println(valor1 ^ valor2);
		System.out.println();
		
		boolean valor3 = true;
		boolean valor4 = true;
		
		System.out.println(valor3 && valor4);
		System.out.println(valor3 || valor4);
		System.out.println(valor3 ^ valor4);
		System.out.println();
		
		boolean valor5 = false;
		boolean valor6 = false;
		
		System.out.println(valor5 && valor6);
		System.out.println(valor5 || valor6);
		System.out.println(valor5 ^ valor6);
		
		// O operador ^ é o OU Exclusivo e vai ser true quando somenete um dos
		// dois valores for true...Se for os dois true ou false, vai dar false

	}

}
