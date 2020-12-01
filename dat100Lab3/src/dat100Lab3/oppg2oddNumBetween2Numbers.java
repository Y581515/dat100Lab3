package dat100Lab3;

import static javax.swing.JOptionPane.*;

public class oppg2oddNumBetween2Numbers {

	public static void main(String[] args) {
		int a = Integer.parseInt(showInputDialog("tall1"));
		int b = Integer.parseInt(showInputDialog("tall2"));

		int i;
		String Resultat = "Resultat: ";
		for (i = a; i <= b; i++) {
			if (i % 2 == 1) {
				if (i == b || i == b - 1) {
					Resultat = Resultat + i + ".";
				} else {
					Resultat = Resultat + i + ", ";
				}
			}
		}

		System.out.println(Resultat);
		showMessageDialog(null, Resultat);
	}
}
