package cadeiraOBJ;

public class ObjetoCadeira {

	public static void main(String[] args) {
		
		Cadeira cad = new Cadeira();
		
		cad.settamanho("média");
		cad.setpreço(200.99);
		cad.setpeso(4.2);
		cad.setcor("Preto");
		
		System.out.println("Especificações da cadeira:");
		System.out.println("Tamanho "+cad.gettamanho());
		System.out.println("R$ " + cad.getpreço());
		System.out.println("Peso " + cad.getpeso() + " kg" );
		System.out.println("cor" + cad.getcor());
		
		
	}

}
