import java.util.Locale;
import java.util.Scanner;

public class Opcoes {

	
	public static void Piramide() {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite varios numeros: ");
	    
	    String seq_num = sc.nextLine();
	    String[] num = seq_num.split(" ");
	    
	    int n = num.length;
	    int vet[] = new int[n];
	    for (int i = 0; i < n; i++) {
	        vet[i] = Integer.parseInt(num[i]);
	    }
	    
	    
	    int posicao = 0;
	    int soma = 0; 

	    for (int e = 0; posicao < n; e++) {
	        int menorNumeroLinha = 0; 

	        for (int f = 0; f <= e && posicao < n; f++) {
	            int numeroAtual = vet[posicao];
	            System.out.print(numeroAtual + " ");
	            posicao++;

	            if (f == 0 || numeroAtual < menorNumeroLinha) {
	                menorNumeroLinha = numeroAtual; 
	            }
	        }

	        soma += menorNumeroLinha; 
	        System.out.println();
	    }

	    System.out.println("A soma dos menores números de cada linha é: " + soma);


	    
	    
	    sc.close();
	}
}
