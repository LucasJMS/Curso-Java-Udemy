package fundamentos;

public class ConversaoNumerica {
	
	public static void main(String[] args) {
		// Conversão Explícita
		float f = (float) 0.1;
		System.out.println(f);
		
		//Conversão Emplícita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		//COnversão Implícita
		int i2 = 'a';
		System.out.println(i2);
		
		//Conversão Implícita
		double d = 1001;
		System.out.println(d);
	}

}
