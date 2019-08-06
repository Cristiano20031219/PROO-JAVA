//alunos:José cristiano Mota
//alunos:Regnaldo Alexandre 
//alunos:wallyson
//alunos:Lenilson
public class Cidade {
//	private static String Cidade;
	private String morador;
	String sexo;
	String numero_da_casa;
	double idade_da_cidade;
	String nome_da_cidade;
	boolean casa_paga;
	
	
	public void setmorador(String m2) {
		morador = m2;
	}
	public String getmorador() {
		return morador;
	}
	
	
	void paga() {
		if (casa_paga == true) {
			System.out.println("vai morar tranquilo!");
		}else {
			System.out.println("vai ser dispejado!");
		}
	}
	public static void main(String agrs[]){
		Cidade morador1= new Cidade();
		morador1.setmorador("José Cristiano");
		morador1.sexo = "masculino ";
		morador1.nome_da_cidade = "Paulo Jacinto";
		morador1.idade_da_cidade= 65;
		morador1.numero_da_casa = "08";
		morador1.casa_paga= true;
		morador1.paga();
		
		
		Cidade morador2= new Cidade();
		morador2.morador = "Regnaldo";
		morador2.sexo = "masculino ";
		morador2.nome_da_cidade = "Paulo Jacinto";
		morador2.idade_da_cidade= 65;
		morador2.numero_da_casa = "106";
		morador2.casa_paga= false;
		morador2.paga();
		System.out.println(morador1.getmorador());
	}
}






		




