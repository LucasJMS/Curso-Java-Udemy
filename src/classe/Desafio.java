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
	 * Esse c�digo acima vai dar erro porque a vari�vel "a" � uma vari�vel de
	 * inst�ncia e o m�todo main, atrav�s do static, o "a" acaba sendo uma
	 * vari�vel de classe. Para acessarmos essa vari�vel de inst�ncia temos que
	 * fazer da seguinte forma:
	 */

	public static void main(String[] args) {
		Desafio d = new Desafio();
		System.out.println(d.a);

	}

}
