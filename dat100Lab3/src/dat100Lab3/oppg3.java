package dat100Lab3;
import static java.lang.Math.*;

public class oppg3 {

	public static void main(String[] args) {
		double x=3;
		int n=3;
		
		
		
		double xIAndre=pow(x,n);
		System.out.println(xIAndre);
		
		
		
		double t = 1;
		for (int i=1;i<=n;i++) {
			t=t*x;
			
		}
		System.out.println(t);
		
		
	}

}
