package oo.heranca;

public class KawasakiNinja extends Moto{
	
	public KawasakiNinja() {
		VELOCIDADE_MAXIMA = 350;
	}
	
	public void acelerar() {
		super.acelerarMais(40);
	}

}
