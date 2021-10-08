//Francine de Paula Nogueira Santos
import java.util.Scanner;


public class salarioFuncionario {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o total de horas trabalhadas: ");
		byte horas = scanner.nextByte();
		System.out.print("Digite seu salario por hora: ");
		float salario = scanner.nextFloat();
		
		float x=0;
		float extra=0;
		
		if(horas>=40){
		extra= horas - 40*4;
		}
		
		x = salario + 40*4 + extra * salario * 0.5f;
		System.out.print("Salario total: R$ "+x);
	}
}

