//Autor:Jos� Cristiano Mota e Regnaldo Alexandre
//obs:inserir o nome do Regnaldo na folha
//Arquivo: Pessoa
//Descri��o: Programa para praticar o uso de m�todos e diagrama de classe
//Aula: PROO � Lab4

public class Pessoa {
		String nome;
		double altura;
		double peso;
		boolean falar;
		boolean comer;

	void comer(String alimento) {
		if (comer == true) {
			System.out.println("estou comendo"+alimento);
		} else {
			System.out.println("n�o estou comendo"+alimento);
		}
		
		}
	void falar (String mensagem) {
		if (falar == true) {
			System.out.println(mensagem);
		}else {
			
			System.out.println("n�o estou falando");
		}
		

	}
	void faixa_da_pessoa (double imc) {
		if (imc <18.5) {
			System.out.println("esta a baixo");
		}else if (imc > 18.5 && imc < 24.9){
			System.out.println("esta Normal");
		}else if (imc > 25 && imc < 29.9) {
			System.out.println("esta acima");
		}else if (imc >= 30.0) {
			System.out.println("esta obeso");
		}
		
	}
//	tira o void porque tem retorno:void � para quando n�o tem retorno
	double IMMC() {
		double IMMC = peso/altura*altura;
		System.out.println("seu nome � "+nome);
		System.out.println("sua soma � "+IMMC);
		return IMMC;
	
		}

	public static void main(String[] agrs) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Jos� Cristiano";
		pessoa1.peso = 60;
		pessoa1.altura = 1.50;
		pessoa1.comer = true;
		pessoa1.falar = true;
		pessoa1.comer("estou comendo");
		pessoa1.falar("estou falando");
		pessoa1.faixa_da_pessoa(pessoa1.IMMC());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Jos� Cristiano";
		pessoa2.peso = 60;
		pessoa2.altura = 1.50;
		pessoa2.comer = true;
		pessoa2.falar = true;
		pessoa2.comer("estou comendo");
		pessoa2.falar("estou em dialogo");
		pessoa2.faixa_da_pessoa(pessoa2.IMMC());
		
	
		
		
	}

}
