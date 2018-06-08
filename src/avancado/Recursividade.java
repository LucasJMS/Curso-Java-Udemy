package avancado;

public class Recursividade {
	
	public static void main(String[] args) {
		System.out.println(fatorialFor(3));
		System.out.println(fatorial(3));
	}
	
	public static int fatorialFor(int numero){
		
		int fatorial = 1;
		
		for(int i = 1; i <= numero; i++){
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
	
	public static int fatorial(int numero){
		
		if(numero <= 1){
			return 1;
		}
		// N�o precisa do else
		return numero * fatorial(numero - 1);
	}

}
