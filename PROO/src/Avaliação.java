//alunos:Jos� cristiano Mota
//alunos:Regnaldo Alexandre 
public class Avalia��o {
	private static String Avalia��o;
	String estudante;
	String sexo;
	String numero_de_matricula;
	String data_da_prova;
	String nome_curso;
	boolean estudando;
	
	void paga() {
		if (estudando == true) {
			System.out.println("vai concluir o curso!");
		}else {
			System.out.println("n�o vai comcluir o curso obs:Bolsonaro cortou verbas  !");
		}
	}
	public static void main(String[]agrs){
		Avalia��o prova1= new Avalia��o();
		prova1.estudante = "Jos� Cristiano";
		prova1.sexo = "masculino ";
		prova1.numero_de_matricula = "48759678";
		prova1.data_da_prova= "12092000";
		prova1.nome_curso ="informatica para internet ";
		
		Avalia��o prova2= new Avalia��o();
		prova2.estudante = "Regnaldo Silva";
		prova2.sexo = "masculino ";
		prova2.numero_de_matricula = "78956847";
		prova2.data_da_prova= "12092000";
		prova2.nome_curso ="informatica para internet ";
	}
}






		




