
public class Cal�adoTeste {
	public static void main(String [] args) {
		Cal�ado[] cal�ado = new Cal�ado[5];
		cal�ado[0] = new Cal�ado("Adidas",42,"Branco");
		cal�ado[1] = new Cal�ado("Nike",41,"Azul");
		cal�ado[2] = new Cal�ado("Puma",40,"Roxo");
		cal�ado[3] = new Cal�ado("Vans",28,"Preto");
		cal�ado[4] = new Cal�ado("Ous",35,"Branco");
		for(int i=0;i <5;i++){
			System.out.println("A marca do seu cal�ado �"+"\t"  + cal�ado[i].getMarca()+ "\t" + "Tamanho"+ "\t" +cal�ado[i].getTamanho());
		cal�ado[i].correr();
		}
		
	}
}
 