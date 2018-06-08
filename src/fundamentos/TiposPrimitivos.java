package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos primitivos booleano
		boolean bo1 = true;
		boolean bo2 = false;
		System.out.printf("%b %b\n", bo1, bo2);
		
		// Tipos primitivos caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		// Tipos primitivos inteiro
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		
		// Tipo primitivos reais
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%.2f %f", f, d);
	}

}
