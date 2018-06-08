package oo.heranca;

public class TesteMoto {
	
	public static void main(String[] args) {
		Moto m = new Lambreta();
		m.acelerar();
		System.out.println(m.getVelocidadeAtual());
		
		m = new KawasakiNinja();
		m.acelerar();
		System.out.println(m.getVelocidadeAtual());
		m.frear();
		System.out.println(m.getVelocidadeAtual());
		
	}
}
