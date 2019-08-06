
public class Celular extends DispositivosEletronicos{
	private String tipodeaparelho;
	private String operadora;
	private String numero;
	
	private boolean estafuncionando;
	
	public void anotarnumero(String numero) {
		System.out.println(numero);
		nomedodispositivo = "iphone xs";
	
	}
	public static void main(String[] args) {
		Celular celular1 = new Celular();
		celular1.numero = "9854787";
		celular1.tipodeaparelho = "movevl";
		celular1.operadora = "vivo"; 
		celular1.ligado("o dispositivo está ligado");
	}

}
