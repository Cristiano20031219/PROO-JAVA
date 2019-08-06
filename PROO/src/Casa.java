//alunos:José cristiano Mota
//alunos:Regnaldo Alexandre 
public class Casa {
		private String proprietario_da_casa;
		String tipo_de_casa;
		double métros_quadrado;
		double IPTU;
		boolean toda_quitada;
		
		public void setproprietario_da_casa(String p) {
			proprietario_da_casa = p;
		}
		public String getproprietario_da_casa() {
			return proprietario_da_casa;
		}
		
		void paga() {
			if (toda_quitada == true) {
				System.out.println("more tranquilo!");
			}else {
				System.out.println("trabalhe para quitar a casa !");
			}
		}
		public static void main(String[]agrs){
			Casa imovel1 = new Casa();
			imovel1.setproprietario_da_casa("Xandinho");
			imovel1.tipo_de_casa = "fazenda";
			imovel1.métros_quadrada = 200;
			imovel1.IPTU = 100;
			imovel1.paga ();
			
			Casa imovel2 = new Casa();
			imovel2.setproprietario_da_casa("Cristiano");
			imovel2.tipo_de_casa = "mansão";
			imovel2.métros_quadrada = 128;
			imovel2.IPTU = 385.89;
			imovel2.paga ();
			System.out.println(imovel1.setproprietario_da_casa("Cristiano"));
		}
	}


