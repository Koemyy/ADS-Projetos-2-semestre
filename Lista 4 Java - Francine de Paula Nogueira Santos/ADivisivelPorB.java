//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Digite o primeiro numero: ");
		a = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		b = scanner.nextInt();
		
		if(a>=0&&a<=1000&&b>0&&b<=20){
			if(a%b==0){
				System.out.println("E divisivel");
			}
			else if(a%b!=0){
			System.out.println("Nao e divisivel");
			}
		}
		else{
			System.out.println("Numero invalido");
		}
	}
}

