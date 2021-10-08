//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nota;
		
		System.out.print("Digite sua nota: ");
		nota = scanner.nextDouble();
		
		if (nota>10||nota<0){
			System.out.println("VALOR INVALIDO");
		}
		else if (nota<6){
			System.out.println("REPROVADO");
		}
		else{
			System.out.println("APROVADO");
		}
	}
}

