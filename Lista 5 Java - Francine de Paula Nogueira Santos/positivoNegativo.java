//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class positivoNegativo {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = scanner.nextInt();
		
		if(numero>=0){
			System.out.print("Numero positivo");
		}
		else{
			System.out.print("Numero negativo");
		}
	}
}

