//Aluno:aluno:José Cristiano mota e Regnaldo Alexandre
public class Produto {
	String nome;
	int codigo;
	private double precocusto;
	private double precovenda;
//	produto de higine ou não
	protected String categoria;
	
	public void setPrecocusto(double p) {
		precocusto = p;
	}
	public double getPrecocusto() {
		return precocusto;
	}
	public void setPrecovenda(double pv) {
		precovenda = pv;
	}
	public double getPrecovenda() {
		return precovenda;
	}
	
	void produto() {
		if (precocusto < 0) {
			System.out.println("não pode ser menor ");
		}else if(precovenda < precocusto) {
			System.out.println("não pode o precovenda tem que ser maior");
		}
	
	
	}
} 
	
	
