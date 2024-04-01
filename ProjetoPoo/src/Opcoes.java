/* import java.util.Locale;
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

        System.out.println("Digite a quantidade de linhas da sua piramide: ");
        int tam = sc.nextInt();

        int rep = 0;
        for (int e = 0; e < tam; e++) {
            for (int f = 0; f <= e; f++) {
                System.out.print(vet[rep % n] + " ");
                rep++;
            }
            System.out.println();
        }

        int zeze = 0;
        int[][] piramide = new int[tam][]; 
        for (int c = 0; c < tam; c++) {
            int[] linha = new int[c + 1]; 
            for (int d = 0; d <= c; d++) {
                linha[d] = vet[zeze % n];
                zeze++;
            }
            piramide[c] = linha; 
        }

        int somaMenores = 0; 
        for (int i = 0; i < piramide.length; i++) {
            int menor = piramide[i][0]; 
            for (int j = 1; j < piramide[i].length; j++) {
                if (piramide[i][j] < menor) {
                    menor = piramide[i][j]; 
                }
            }
            somaMenores += menor; 
        }

        System.out.println("Soma dos menores numeros de cada linha: " + somaMenores);

        sc.close();
    }

}   */

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
	                menorNumeroLinha = numeroAtual; // Atualiza o menor número da linha
	            }
	        }

	        soma += menorNumeroLinha; 
	        System.out.println();
	    }

	    System.out.println("A soma dos menores números de cada linha é: " + soma);


	    
	    
	    sc.close();
	}
}