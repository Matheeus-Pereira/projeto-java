package projeto;

import javax.swing.JOptionPane;

public abstract class Funcoes {

	public void tela(String i) {
		JOptionPane.showMessageDialog(null, i);
	}

	public void tela(double i) {
		JOptionPane.showMessageDialog(null, i);
	}

	public int receberInt(String i) {
		int t = Integer.parseInt(JOptionPane.showInputDialog(i, null));
		return t;
	}

	public String receberString(String i) {
		String t = JOptionPane.showInputDialog(i);

		return t;
	}

	public void escrever_vetor(String[] a) {
		for (int i = 0; i <= a.length; i++) {
			this.tela(a[i]);
		}

	}

	

}
