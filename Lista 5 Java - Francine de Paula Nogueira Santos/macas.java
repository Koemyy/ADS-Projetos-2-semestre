//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class macas {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero de macas que deseja comprar: ");
		int macass = scanner.nextInt();
		
		float x;
		float preco;
		
		if(macass>=12){
			preco = 1.0f;
			x=1*macass;
			System.out.print("O total da compra e: "+x);
		}
		else{
			preco = 1.30f;
			x=preco*macass;
			System.out.print("O total da compra e: "+x);
		}
		
	}
}

