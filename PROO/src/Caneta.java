//Aluno:José cristiano Mota Da Silva Filho
//Aluno:Regnaldo Alexandre da Silva Filho
public class Caneta {
	private String modelo;
	String cor;
	double ponta;
	double carga;
	boolean tampado;
	
	public void setmodelo(String m3) {
		modelo = m3;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	void escrever () {
		if (tampado == true) {
			System.out.println("erro");	
		}
		else {
			System.out.println("escrever");
		}
	}
	void tampar () {
		tampado = true;
	}
	public static void main(String[] args) {
		Caneta caneta1 = new Caneta ();
		caneta1.setmodelo("compact");
		caneta1.cor ="azul";
		caneta1.carga = 50;
		caneta1.ponta = 0.5;
		caneta1.tampado= true;
		caneta1.escrever();
	
		Caneta caneta2 = new Caneta ();
		caneta2.setmodelo("bic");
		caneta2.cor ="verde";
		caneta2.carga = 60;
		caneta2.ponta = 1.5;
		caneta2.tampado= false;
		caneta2.escrever();
		System.out.println(caneta1.getmodelo());
		System.out.println(caneta1.getmodelo());
		
		
		
	
	}	
	
}
