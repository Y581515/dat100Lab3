package dat100Lab3;
import static javax.swing.JOptionPane.*;

public class oppg6n {

	public static void main(String[] args) {
		int n=Integer.parseInt(showInputDialog("sett inn tall du vil finne fakuliteten til"));
		
				int t = 1;
				for (int i=0;i<n;i++) {
				t=t*(n-i);
				}
				showMessageDialog(null,n+"! =  "+t);
	}
}
