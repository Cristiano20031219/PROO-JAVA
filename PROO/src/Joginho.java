import java.util.Scanner;
public class Joginho {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("voc� tem medo de tecnologia?");
		String pergunta1 = entrada.nextLine();
		
		if (pergunta1 == "sim") {
			System.out.println("Voc� ou seu pai � rico?");
			String pergunta2 = entrada.nextLine();
			
			if (pergunta2 == "sim") {
				System.out.println("USE APPLE");
			}else if (pergunta2 =="n�o") {
				System.out.println("USE CHOME OS");
			}
		if (pergunta1 == "n�o") {
			System.out.println("voc� se preocupa com liberdade e privacidade?");
			String pergunta3 = entrada.nextLine();
			
			if (pergunta3 =="sim") {
				System.out.println("voc� tem uma vida ?");
				String pergunta4 = entrada.nextLine();
				
				if (pergunta4 =="sim") {
					System.out.println("USE LINUX UBUNTO,MINT OU FENDORA");
					
					if (pergunta3 == "n�o") {
						System.out.println("USE WINDOWS! ");
						
					}
				}
			}
		}
		}
	}

}
