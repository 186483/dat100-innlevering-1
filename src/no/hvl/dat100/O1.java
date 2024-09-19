package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String poengsumInput = JOptionPane.showInputDialog("Tast inn poengsum fra 0 til 100:");

			int poengsum = Integer.parseInt(poengsumInput);

			if (poengsum < 0 || poengsum > 100) {
				JOptionPane.showMessageDialog(null, "Feil: Ugyldig poengsum. Prøv igjen.");
				i = i - 1;
			} else {

				String karakter;
				if (poengsum >= 90) {
					karakter = "A";
				} else if (poengsum >= 80) {
					karakter = "B";
				} else if (poengsum >= 60) {
					karakter = "C";
				} else if (poengsum >= 50) {
					karakter = "D";
				} else if (poengsum >= 40) {
					karakter = "E";
				} else {
					karakter = "F";
				}
				JOptionPane.showMessageDialog(null, "Student " + i + " har karakter: " + karakter);
			}

		}
	}

}
