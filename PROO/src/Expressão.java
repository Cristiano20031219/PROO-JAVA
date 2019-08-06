import java.util.Scanner;
public class Expressão {
	public static void main(String[] args) {
		Scanner saida = new Scanner(System.in);
//		int a=10;
//		int b=8;
//		int c=4;
//		int d=12;	
//		boolean expressão= (a * b > 100 || (c != 2 && (c + d )<20));
//		System.out.println(expressão);
//		01
	System.out.println("digite feriado");
		String feriado = saida.nextLine();
		if (feriado == "feriado") {
			System.out.println("Não haverar aula");
		}
////		02
		System.out.println("digite sua idade");
		int idade = saida.nextInt();
		if (idade >= 16) {
			System.out.println("já pode votar");
		}
////		03
		System.out.println("digite sua idade");
		int idade2 = saida.nextInt();
		if (idade >= 18) {
			System.out.println("já posso tirar a habilitação");
		}
////		04/5 os 2 em um
		System.out.println("digite sua senha");
		double senha = saida.nextDouble();
		if (senha == senha) {
			System.out.println("pode tirar o dinheiro");
		}
		System.out.println("digite seu saldo");
		double saldo = saida.nextDouble();
		if (saldo >0) {
			System.out.println("tem dinheiro,pode comprar");
		}else {
			System.out.println("não tem dinheiro,não pode comprar");
		}
		
//		06
		System.out.println("digite a nota1");
		double nota1 = saida.nextByte();
		System.out.println("digite a nota2");
		double nota2 = saida.nextByte();
		System.out.println("digite a nota3");
		double nota3 = saida.nextByte();
		System.out.println("digite a nota4");
		double nota4 = saida.nextByte();
		
		double media_fnal =(nota1+nota2+nota3+nota4)/4;
		
		if (media_fnal >= 7) {
			System.out.println("passei direto");
		}else {
			System.out.println("vai para a prova final");
		}
//		07
		System.out.println("digite chovenso se estiver");
		String chovendo = saida.nextLine();
		if (chovendo == "chovendo") {
			System.out.println("vou estudar");
		}else {
			System.out.println("vou a praia ");
		}
//		08
		System.out.println("digite seu salario");
		double salario = saida.nextDouble();
		if (salario > 30.000) {
			System.out.println("vou trocar de carro ");
		}else {
			System.out.println("vou esperar o 13º salario");
		}
		
//		09
		System.out.println("digite tempo livre se já terminou de estudar e fazer as coisas ");
		String tempo_livre = saida.nextLine();
		if (tempo_livre == "tempo livre" ) {
			System.out.println("posso assitir um filme");
		}
//		10
		System.out.println("digite quanto você tem");
		double total = saida.nextDouble();
		System.out.println("digite o valor do jogo");
		double valor_do_jogo = saida.nextDouble();
		
		double valor_que_sobrar = (total-valor_do_jogo);
		if (valor_que_sobrar >100) {
			System.out.println("posso sair com os meus amigos ");
		}
//		11
		System.out.println("digite sua idade ");
		int idade3 = saida.nextInt();
		if (idade3 >= 10 || idade3 >65) {
			System.out.println("você só paga meia entrada");
		}
//		12
		System.out.println("digite o valor da compra");
		double valor_da_compra = saida.nextDouble();
		System.out.println("digite a quantidade de camisas");
		int camisas = saida.nextInt();
		
		if (valor_da_compra > 200 || camisas >= 4) {
			System.out.println("frete gratis");
		}else {
			System.out.println("caso não atinja,é cobrado R$20 para compras até R$200, e R$25 para compras até R$100");
		}
//		13
		System.out.println("digite fechado,se o sinal estiver fechado");
		String sinal = saida.nextLine();
		if (sinal == "fechado") {
			System.out.println("pode atravessar a rua ");
		}else {
			System.out.println("é melhor esperar o sinal fechar");
		}
//		14
		System.out.println("digite a quantidade que tem no seu estoque ");
		int estoque = saida.nextInt();
		if (estoque >= 100) {
			System.out.println("tenho o suficiente para os eus clientes ");
		}else if (estoque >= 50) {
			System.out.println("vou me planejar para repor meu estoque em breve");
		}else if (estoque < 50) {
			System.out.println("devo ligar imediatamente para o fornecedor e fazer um novo contrato para comprar novos produto");
		}
			
	}
	

}
