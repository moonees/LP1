
public class LugarTest {
	public static void main(String[] args) {
		Lugar[] lugar = new Lugar[5];
		lugar[0] = new Lugar("Rio de Janeiro","Brasil");
		lugar[1] = new Lugar("S�o Paulo","Brasil");
		lugar[2] = new Lugar("Nova York","Estados Unidos");
		lugar[3] = new Lugar("Foz do Igua�u","Paraguai");
		lugar[4] = new Lugar("Toquio","Jap�o");
		
		for(int i=0; i<5; i++) {
			System.out.println(lugar[i].getNome() + "\t" + "� uma cidade localizada no" + "\t" + lugar[i].getPa�s());
		}
		lugar[0].lugar();
		
				
	}
}
