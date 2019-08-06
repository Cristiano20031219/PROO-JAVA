//alunos:José cristiano Mota
//alunos:Regnaldo Alexandre 
public class Documento {
	static //private static String CPF;
	String proprietario_do_cpf;
	String sexo;
	String numero_do_CPF;
	double data_de_nascimento;
	boolean vivo;
	
	public void setproprietario_do_cpf(String v) {
		proprietario_do_cpf=v;
	}
	public static String getproprietario_do_cpf() {
		return proprietario_do_cpf;
	}
	
	void paga() {
		if (vivo == true) {
			System.out.println("individuo!");
		}else {
			System.out.println("CPF canselado !");
		}
	}
	public static void main(String[]agrs){
		Documento cpf1 = new Documento();
		cpf1.proprietario_do_cpf = "José Cristiano";
		cpf1.sexo = "masculino ";
		cpf1.numero_do_CPF = "48759678963";
		cpf1.data_de_nascimento= 12092000;
		cpf1.vivo= true;
		cpf1.vivo();
		
		Documento cpf2 = new Documento();
		cpf2.proprietario_do_cpf = "Regnaldo Silva ";
		cpf2.sexo = "Masculino";
		cpf2.numero_do_CPF = "45698712396";
		cpf2.data_de_nascimento= 29042001;
		cpf1.vivo= false;
		cpf1.vivo();
		System.out.println(cpf1.getproprietario_do_cpf());
	}
	private void vivo() {
		// TODO Auto-generated method stub
		
	}
}





