//Francine de Paula Nogueira Santos
import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double precoProduto1;
		double precoProduto2;
		
		System.out.print("Digite o preco do primeiro produto: ");
		precoProduto1 = scanner.nextDouble();
		System.out.print("Digite o preco do segundo produto: ");
		precoProduto2 = scanner.nextDouble();
		
		if(precoProduto1<1 || precoProduto1>1000 && precoProduto2<1 || precoProduto2>1000){
			System.out.println("VALOR INVALIDO");
		}
		else if(precoProduto1<precoProduto2){
			System.out.println("O produto 1 e o mais barato");
		}
		else if(precoProduto2<precoProduto1) {
			System.out.println("O produto 2 e o mais barato");
		}
		else{
			System.out.println("Os precos dos dois produtos sao iguais");
		}
	}
}

