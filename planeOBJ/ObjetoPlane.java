package planeOBJ;



public class ObjetoPlane {

	public static void main(String[] args) {
		
		Plane Av1 = new Plane();
		Plane Av2 = new Plane();
		Plane Av3 = new Plane();
		Plane Av4 = new Plane();
		
		Av1.setmodelo("747");
		Av1.setmarca("BOING");
		Av1.settipo("JUMBO");
		Av1.setcor("Azul escuro");
		Av1.setpeso("500T");
		Av1.setacelera("muito");
		Av1.setalt(40655);
		Av1.setperm_voo("Não");
		
		Av2.setmodelo("685");
		Av2.setmarca("AIRBUS");
		Av2.settipo("MÉDIO");
		Av2.setcor("Azul ");
		Av2.setpeso("150T");
		Av2.setacelera("muito");
		Av2.setalt(30665);
		Av2.setperm_voo("SIM");

		Av3.setmodelo("105");
		Av3.setmarca("Embraer");
		Av3.settipo("Grande");
		Av3.setcor("Verde ");
		Av3.setpeso("300T");
		Av3.setacelera("muito");
		Av3.setalt(35665);
		Av3.setperm_voo("SIM");
		
		Av4.setmodelo("A-10");
		Av4.setmarca("Fairchild Republic");
		Av4.settipo("pequeno");
		Av4.setcor("prata");
		Av4.setpeso("100T");
		Av4.setacelera("DE MAIS");
		Av4.setalt(25000);
		Av4.setperm_voo("SIM");
		
		System.out.println(" [ AVIÃO 1 ]"); 
		System.out.println("MODELO  - "+Av1.getmodelo());
		System.out.println("MARCA   - "+Av1.getmarca());
		System.out.println("TAMANHO - "+Av1.gettipo());
		System.out.println("COR     - "+Av1.getcor());
		System.out.println("PESO    - "+Av1.getpeso());
		System.out.println("ALTIUDE - "+Av1.getalt());
		System.out.println("ACELERAÇÃO    - "+Av1.getacelera());
		System.out.println("PERMIÇÃO DE VOO - "+Av1.getperm_voo());
		
		System.out.println(" [ AVIÃO 2 ]"); 
		System.out.println("MODELO  - "+Av2.getmodelo());
		System.out.println("MARCA   - "+Av2.getmarca());
		System.out.println("TAMANHO - "+Av2.gettipo());
		System.out.println("COR     - "+Av2.getcor());
		System.out.println("PESO    - "+Av2.getpeso());
		System.out.println("ALTIUDE - "+Av2.getalt());
		System.out.println("ACELERAÇÃO    - "+Av2.getacelera());
		System.out.println("PERMIÇÃO DE VOO - "+Av2.getperm_voo());
		
		System.out.println(" [ AVIÃO 3 ]"); 
		System.out.println("MODELO  - "+Av3.getmodelo());
		System.out.println("MARCA   - "+Av3.getmarca());
		System.out.println("TAMANHO - "+Av3.gettipo());
		System.out.println("COR     - "+Av3.getcor());
		System.out.println("PESO    - "+Av3.getpeso());
		System.out.println("ALTIUDE - "+Av3.getalt());
		System.out.println("ACELERAÇÃO    - "+Av3.getacelera());
		System.out.println("PERMIÇÃO DE VOO - "+Av3.getperm_voo());
		
		System.out.println(" [ AVIÃO 4 ]"); 
		System.out.println("MODELO  - "+Av4.getmodelo());
		System.out.println("MARCA   - "+Av4.getmarca());
		System.out.println("TAMANHO - "+Av4.gettipo());
		System.out.println("COR     - "+Av4.getcor());
		System.out.println("PESO    - "+Av4.getpeso());
		System.out.println("ALTIUDE - "+Av4.getalt());
		System.out.println("ACELERAÇÃO    - "+Av4.getacelera());
		System.out.println("PERMIÇÃO DE VOO - "+Av4.getperm_voo());
	
		
		
	}

}
