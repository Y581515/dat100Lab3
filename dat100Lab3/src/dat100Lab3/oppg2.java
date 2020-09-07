package dat100Lab3;
import static javax.swing.JOptionPane.*;


public class oppg2 {

	public static void main(String[] args) {
		int a=Integer.parseInt(showInputDialog("tall1"));
		int b=Integer.parseInt(showInputDialog("tall2"));
		
		int i;
		
		for (i=a;i<=b;i++) {
			if(i%2==1) {
				showMessageDialog(null,"Resultat: "+i+", ");
				
			}	
		}
		
	}
}
