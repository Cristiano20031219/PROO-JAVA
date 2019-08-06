
public class Agenda extends Caderno{
	private String datas;
	private boolean temcalendario;
	private String diadasemana;
	
	public void anotarcompromisso(String compromisso) {
		System.out.println(compromisso);
		numerodefolhas = 500;
	}
	public static void main(String[] args) {
		Caderno caderno = new Caderno();
		caderno.numerodefolhas = 100;
		caderno.marca = "tilibra";
		caderno.escrever("a mensagem é ");
		
		
	}

}
