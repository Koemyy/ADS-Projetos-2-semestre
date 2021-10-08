//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class mediaAluno {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float n1 = scanner.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = scanner.nextFloat();
		
		float media;
		
		media=(n1+n2)/2;
		
		if(media>=6){
		System.out.println("Sua media e: "+media);
		System.out.println("Voce foi aprovado");
		}
		else{
		System.out.println("Sua media e: "+media);
		System.out.println("Voce foi reprovado");
		}
		
	}
}

