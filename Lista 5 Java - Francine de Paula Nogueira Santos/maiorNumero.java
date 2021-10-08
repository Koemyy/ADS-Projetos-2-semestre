//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class maiorNumero {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = scanner.nextInt();
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		if(v1>v2){
			System.out.print(" "+v1);
		}
		else{
			System.out.print(" "+v2);
		}
		
	}
}

