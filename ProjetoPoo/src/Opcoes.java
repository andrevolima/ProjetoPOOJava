import java.util.Locale;
import java.util.Scanner;

public class Opcoes {

	
	public static void Piramide() {
	    Locale.setDefault(Locale.US);
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("OI");
	    
	    int n = 10;
	    int v[] = new int[n];
	    int i;
	    
	    for (i=0; i<n; i++) {
	        System.out.println("Digite um numero: ");
	        int num_vet = teclado.nextInt();
	        
	        v[i] = num_vet;
	    }
	    
	    for (int a = 0; a < n; a++) {
	        System.out.println(v[a]);
	    }

	    teclado.close();
	}

}
