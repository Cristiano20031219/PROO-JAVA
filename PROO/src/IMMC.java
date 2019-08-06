import java.util.Scanner;

public class IMMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		
		System.out.println("informe seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("infome seu peso");
		double peso = entrada.nextDouble();
		
		System.out.println("informe sua altura");
		double altura = entrada.nextDouble();
		
		double IMMC = (peso/altura*altura);
		System.out.println(IMMC);
		
		double IMMC(String nome,int peso, double altura) {
			double IMMC = quantidade * preco;
			return IMMC;
			
			
		}
	}

}
