//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class crescente {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = scanner.nextInt();
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		int x;
		
		if(v1<v2){
			x=v1;
			System.out.println("  "+x+v2);
		}
		else{
			x=v2;
			System.out.println("  "+x+v1);
		}
		
		
		
	}
}

