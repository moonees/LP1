
public class CalçadoTeste {
	public static void main(String [] args) {
		Calçado[] calçado = new Calçado[5];
		calçado[0] = new Calçado("Adidas",42,"Branco");
		calçado[1] = new Calçado("Nike",41,"Azul");
		calçado[2] = new Calçado("Puma",40,"Roxo");
		calçado[3] = new Calçado("Vans",28,"Preto");
		calçado[4] = new Calçado("Ous",35,"Branco");
		for(int i=0;i <5;i++){
			System.out.println("A marca do seu calçado é"+"\t"  + calçado[i].getMarca()+ "\t" + "Tamanho"+ "\t" +calçado[i].getTamanho());
		calçado[i].correr();
		}
		
	}
}
 