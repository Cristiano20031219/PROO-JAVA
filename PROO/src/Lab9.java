//aluno:José Cristiano e Regnaldo Alexandre
public class Lab9 {
	private int numero;
	private double saldo;
	private double limite;
	
	public LAb9(int numero, double saldo, double limite) {
		this.numero = nemero;
		this.saldo = saldo;
		this.limite = limite;
	}
	public static void main(String[] args) {
		Lab9 lab9 = new Lab9(4587,22250,50000);
		System.out.println(lab9.numero);
		System.out.println(lab9.saldo);
		System.out.println(lab9.limite);
		
	}
	public void setnumero(double numero2) {
		numero = numero2;
	}
	public double getnumero() {
		return numero;
	}
	public void setsaldo(double sal) {
		saldo = sal;
	}
	public double getsaldo() {
		return saldo;
	}
	public void setlimite(double lim) {
		limite = lim;
	}
	public double getlimite() {
		return limite;
	}
	
}

