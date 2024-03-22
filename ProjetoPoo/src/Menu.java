import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Menu");
		System.out.println("Digite '1' para iniciar a meia piramide");
		
		
		int num = sc.nextInt();
		
		switch (num) {
			case 1:
				Opcoes.Piramide();
				break;			
			case 2:
				
		
		}
		
		
		sc.close();
	}

}
