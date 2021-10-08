//Francine de Paula Nogueira Santos

public class Saudacao {
	
	public static void main (String[] args) {
		byte hora = (byte)(Math.random()*24);
		
		if(hora>=0&&hora<=6){
			System.out.println("Zzzzz a mimir");
		}
		else if(hora>=7&&hora<=11){
			System.out.println("Bom dia");
		}
		else if(hora>=12&&hora<=17){
			System.out.println("Boa tarde");
		}
		else{
			System.out.println("Boa noite");
		}
	}
}

