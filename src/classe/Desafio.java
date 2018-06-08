package classe;

public class Desafio {

	int a = 2;

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(a);
	 * 
	 * }
	 */

	/*
	 * Esse código acima vai dar erro porque a variável "a" é uma variável de
	 * instância e o método main, através do static, o "a" acaba sendo uma
	 * variável de classe. Para acessarmos essa variável de instância temos que
	 * fazer da seguinte forma:
	 */

	public static void main(String[] args) {
		Desafio d = new Desafio();
		System.out.println(d.a);

	}

}
