package fundamentos;

public class ObjetosPrimitivos {

	public static void main(String[] args) {
		Character c = 'a';
		Boolean bo = true; // Se fosse boolean seria tipo primitivo
		// O que muda é que se eu fizer bo. alguma coisa, vai aparecer vários
		// coisas porque ele é um objeto
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4l;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		System.out.println(bo.toString().length());
	}
}
