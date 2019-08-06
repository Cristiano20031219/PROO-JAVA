import java.util.Scanner;

public class EXE02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite o perimetro1");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o perimetro2");
		double altura = entrada.nextDouble();
		
		System.out.println("Ah base é igaul "+"\n"+base*2);
		
		System.out.println("Ah altura é "+"\n"+altura*2);
		
		double area = (base*altura);
		System.out.println("sua area é "+"\n"+area);
		
		
		
	}
	

}
