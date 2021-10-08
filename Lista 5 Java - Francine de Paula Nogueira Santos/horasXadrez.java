//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class horasXadrez {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int inicio = scanner.nextInt();
		System.out.print("Digite o segundo valor: ");
		int fim = scanner.nextInt();
		
		int x;
		
		x=fim-inicio;
		
		System.out.println("A duracao total do jogo foi: "+x);
		
	}
}

