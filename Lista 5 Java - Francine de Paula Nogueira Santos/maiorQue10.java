//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class maiorQue10 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = scanner.nextInt();
		
		if(numero>10){
			System.out.print("E MAIOR QUE 10!");
		}
		else{
			System.out.print("NAO E MAIOR QUE 10!");
		}
	}
}

