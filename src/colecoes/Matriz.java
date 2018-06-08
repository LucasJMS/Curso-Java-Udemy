package colecoes;

public class Matriz {

	public static void main(String[] args) {

		double[][] notasJoao = { { 7.5, 10 }, { 8.9, 9.1 } };

		double[][] notasPedro = new double[2][]; /* Indico apenas o numero de elementos do array mais externo e os 
		elementos de cada um deles pode variar */
		notasPedro[0] = new double[2];
		notasPedro[1] = new double[2];
		notasPedro[0][0] = 7.5;
		notasPedro[0][1] = 10;
		notasPedro[1][0] = 8.9;
		notasPedro[1][1] = 9.1;

		double totalJoao = 0;
		double qtdNotasJoao = 0;
		for (int i = 0; i < notasJoao.length; i++) {
			for (int j = 0; j < notasJoao[i].length; j++) {
				totalJoao += notasJoao[i][j];
				qtdNotasJoao++;
			}
		}

		double totalPedro = 0;
		double qtdNotasPedro = 0;
		for (double[] notasParciais : notasPedro) {
			for (double nota : notasParciais) {
				totalPedro += nota;
				qtdNotasPedro++;
			}
		}

		System.out.println(totalJoao / qtdNotasJoao);
		System.out.println(totalPedro / qtdNotasPedro);
	}
}
