package oo.heranca;

public class TestDrive {
	
	public static void main(String[] args) {
		
		Carro c = new Civic();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual()); // Civic só herdou de carro sem alterar nada
		
		c = new Ferrari();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual()); // Ferrari herdou de Carro e alterou algumas propriedade e métodos
	}

}
