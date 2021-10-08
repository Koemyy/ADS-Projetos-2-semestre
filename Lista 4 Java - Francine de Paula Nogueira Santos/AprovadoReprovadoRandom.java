//Francine de Paula Nogueira Santos

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		double nota = Math.random()*10;
		
		if (nota<6){
			System.out.println("REPROVADO");
		}
		else{
			System.out.println("APROVADO");
		}
	}
}

