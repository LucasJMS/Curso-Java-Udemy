package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String respostas1 = JOptionPane.showInputDialog("Nota 1:");
		String respostas2 = JOptionPane.showInputDialog("Nota 2:");
		
		System.out.println(respostas1 + respostas2);
		
		double nota1 = Double.parseDouble(respostas1);
		double nota2 = Double.parseDouble(respostas2);
		
		System.out.println(nota1 + nota2);
	}

}
