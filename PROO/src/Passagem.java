//Aluno:José cristiano Mota Da Silva Filho
//Aluno:Regnaldo Alexandre da Silva Filho
public class Passagem {	
	String empresa;
	String inicio_viagem;
	String fim_Viagem;
	double valor_da_passagem;
	double data_de_ida;
	double data_de_vinda;
	double código;
	boolean embarcado;
	
void escrever () {
		
		if (embarcado == true) {
			System.out.println("erro");
			
		}
		else {
			System.out.println("escrever");
			
		}
		
	}
	void sentado_no_avião () {
		embarcado = true;
		
	}
	public static void main(String[] args) {
		Passagem passagem1 = new Passagem ();
		passagem1.empresa = "Tam";
		passagem1.inicio_viagem = "São Paulo";
		passagem1.fim_Viagem =  "Espirito Santo";
		passagem1.valor_da_passagem = 800;
		passagem1.data_de_ida = 12/06/2019;
		passagem1.data_de_vinda = 28/06/2019;
		passagem1.escrever();
		passagem1.sentado_no_avião();
		passagem1.escrever();	
		
		Passagem passagem2 = new Passagem ();
		passagem2.empresa = "Tam";
		passagem2.inicio_viagem = "maceio";
		passagem2.fim_Viagem =  "Recife";
		passagem2.valor_da_passagem = 450;
		passagem2.data_de_ida = 19/07/2019;
		passagem2.data_de_vinda = 28/15/2019;
		passagem2.escrever();
		passagem2.sentado_no_avião();
		passagem2.escrever();	
		
	}
}


