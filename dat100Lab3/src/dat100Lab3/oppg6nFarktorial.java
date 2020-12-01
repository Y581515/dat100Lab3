package dat100Lab3;

import static javax.swing.JOptionPane.*;

public class oppg6nFarktorial {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("sett inn tall du vil finne fakuliteten til"));

		int t = 1;
		for (int i = 0; i < n; i++) {
			t = t * (n - i);
		}
		System.out.println(n + "! =  " + t);
		showMessageDialog(null, n + "! =  " + t);

		System.out.println(n + "! =  " + fakulitet(n));
	}

	public static int fakulitet(int tal) {
		if (tal == 0) {
			tal = 1;
		} else {
			tal = tal * fakulitet(tal - 1);
		}
		return tal;
	}
}
