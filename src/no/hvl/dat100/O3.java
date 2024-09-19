package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn et heltall som er større enn null");
		int n = Integer.parseInt(input);

		if (n <= 0) {
			JOptionPane.showMessageDialog(null, "Feil: tallet må være større enn null");
			return;
		}

		int fakultet = 1;
		for (int i = 1; i <= n; i++) {
			fakultet = fakultet * i;
		}
		
		JOptionPane.showMessageDialog(null, n + "! = " + fakultet);
	}
}
