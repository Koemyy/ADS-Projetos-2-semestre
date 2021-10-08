//Francine de Paula Nogueira Santos

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		double precoProduto1 = Math.random()*1000;
		double precoProduto2 = Math.random()*1000;
		
		if(precoProduto1>precoProduto2){
			System.out.println("O produto 1 e o mais barato");
		}
		else if(precoProduto1<precoProduto2){
			System.out.println("O produto 2 e o mais barato");
		}
		else{
			System.out.println("Os precos dos dois produtos sao iguais");
		}
		
	}
}

