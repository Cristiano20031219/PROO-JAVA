//alunos:José cristiano Mota
//alunos:Regnaldo Alexandre 
public class Amigo {
//	private static String Amigo;
	String nome_do_amigo;
	String sexo;
	String numero_da_casa;
	String nome_da_rua;
	String nome_da_cidade;
	boolean presta;
	
	void paga() {
		if (presta == true) {
			System.out.println("melhor amigo obs: se pagar açai!");
		}else {
			System.out.println("pior amigo obs:não pagou açai!");
		}
	}
	public static void main(String agrs[]){
		Amigo amigo1= new Amigo();
		amigo1.nome_do_amigo = "José Cristiano";
		amigo1.sexo = "masculino ";
		amigo1.numero_da_casa = "08";
		amigo1.nome_da_rua= "menino Carlos Daniel";
		amigo1.nome_da_cidade ="Paulo jacinto ";
		amigo1.presta= true;
		amigo1.paga();
		
		Amigo amigo2= new Amigo();
		amigo2.nome_do_amigo = "José Cristiano";
		amigo2.sexo = "masculino ";
		amigo2.numero_da_casa = "08";
		amigo2.nome_da_rua= "menino Carlos Daniel";
		amigo2.nome_da_cidade ="Paulo jacinto ";
		amigo1.presta= false;
		amigo1.paga();
	}
}







