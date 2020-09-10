
public class LugarTest {
	public static void main(String[] args) {
		Lugar[] lugar = new Lugar[5];
		lugar[0] = new Lugar("Rio de Janeiro","Brasil");
		lugar[1] = new Lugar("São Paulo","Brasil");
		lugar[2] = new Lugar("Nova York","Estados Unidos");
		lugar[3] = new Lugar("Foz do Iguaçu","Paraguai");
		lugar[4] = new Lugar("Toquio","Japão");
		
		for(int i=0; i<5; i++) {
			System.out.println(lugar[i].getNome() + "\t" + "É uma cidade localizada no" + "\t" + lugar[i].getPaís());
		}
		lugar[0].lugar();
		
				
	}
}
