//alunos:José cristiano Mota
//alunos:Regnaldo Alexandre 
public class Curso {
	//private static String Curso;
	private String estudante;
	String sexo;
	private String numero_de_matricula;
	double data_de_nascimento;
	String nome_curso;
	boolean estudando;
	
	public void setestudante(String e) {
		estudante=e;
	}
	public String getestudante() {
		return estudante;
	}
	public void setnumero_de_matricula(String m) {
		numero_de_matricula= m;
	}
	public String getnumero_de_matricula() {
		return numero_de_matricula;
	}
	
	void paga() {
		if (estudando == true) {
			System.out.println("vai concluir o curso!");
		}else {
			System.out.println("não vai comcluir o curso, obs:Bolsonaro cortou verbas  !");
		}
	}
	public static void main(String[]agrs){
		Curso estudante1= new Curso();
		estudante1.setestudante ("José Cristiano");
		estudante1.sexo = "masculino ";
		estudante1.setnumero_de_matricula("48759678");
		estudante1.data_de_nascimento= 12092000;
		estudante1.nome_curso= "informatica para internet";
		estudante1.estudando= true;
		estudante1.paga();
		
		Curso estudante2= new Curso();
		estudante2.setestudante("José Cristiano");
		estudante2.sexo = "masculino ";
		estudante2.setnumero_de_matricula("78956847");
		estudante2.data_de_nascimento= 12092000;		
		estudante1.nome_curso= "informatica para internet";
		estudante1.estudando= false;
		estudante1.paga();
		System.out.println(estudante1.getestudante());
	}
}






		

