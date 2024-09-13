package carroOBJ;


public class ObjetoCarro {

	public static void main(String[] args) {
	
		Carro Lucas = new Carro();
		Carro Junin = new Carro();
		Carro Helio = new Carro();
		Carro Lorena = new Carro();

		Lucas.setmodelo("Senna");
		Lucas.setmarca("Mc Laren");
		Lucas.settipo("Esportivo");
		Lucas.setcor("Azul escuro");
		Lucas.setfarol("Baixo");
		Lucas.setacelera("muito");
		Lucas.setviraL("sim");
		Lucas.setviraR("Não");
		
		Junin.setmodelo("Aventador");
		Junin.setmarca("Ferrari");
		Junin.settipo("Esportivo");
		Junin.setcor("Preto");
		Junin.setfarol("ALto");
		Junin.setacelera("muito");
		Junin.setviraL("sim");
		Junin.setviraR("Não");
		
		Helio.setmodelo("Corvete");
		Helio.setmarca("Mc laren");
		Helio.settipo("Esportivo");
		Helio.setcor("Azul");
		Helio.setfarol("Alto");
		Helio.setacelera("muito");
		Helio.setviraL("Não");
		Helio.setviraR("Sim");

		Lorena.setmodelo("Brasilia");
		Lorena.setmarca("Voskvagen");
		Lorena.settipo("KOMBI");
		Lorena.setcor("Amarela");
		Lorena.setfarol("Baixo");
		Lorena.setacelera("SIM");
		Lorena.setviraL("Não");
		Lorena.setviraR("sim");
		
		System.out.println(" [ Carro 1 ]"); 
		System.out.println("MODELO  - "+Lucas.getmodelo());
		System.out.println("MARCA   - "+Lucas.getmarca());
		System.out.println("TIPO    - "+Lucas.gettipo());
		System.out.println("COR     - "+Lucas.getcor());
		System.out.println("FAROL   - "+Lucas.getfarol());
		System.out.println("ACELERA - "+Lucas.getacelera());
		System.out.println("VIRA DIREITA  - "+Lucas.getviraL());
		System.out.println("VIRA ESQUERDA - "+Lucas.getviraR());
		
		System.out.println(" [ Carro 2 ]"); 
		System.out.println("MODELO  - "+Junin.getmodelo());
		System.out.println("MARCA   - "+Junin.getmarca());
		System.out.println("TIPO    - "+Junin.gettipo());
		System.out.println("COR     - "+Junin.getcor());
		System.out.println("FAROL   - "+Junin.getfarol());
		System.out.println("ACELERA - "+Junin.getacelera());
		System.out.println("VIRA DIREITA  - "+Junin.getviraL());
		System.out.println("VIRA ESQUERDA - "+Junin.getviraR());
		
		System.out.println(" [ Carro 3 ]"); 
		System.out.println("MODELO  - "+Helio.getmodelo());
		System.out.println("MARCA   - "+Helio.getmarca());
		System.out.println("TIPO    - "+Helio.gettipo());
		System.out.println("COR     - "+Helio.getcor());
		System.out.println("FAROL   - "+Helio.getfarol());
		System.out.println("ACELERA - "+Helio.getacelera());
		System.out.println("VIRA DIREITA  - "+Helio.getviraL());
		System.out.println("VIRA ESQUERDA - "+Helio.getviraR());
		
		System.out.println(" [ Carro 4 ]"); 
		System.out.println("MODELO  - "+Lorena.getmodelo());
		System.out.println("MARCA   - "+Lorena.getmarca());
		System.out.println("TIPO    - "+Lorena.gettipo());
		System.out.println("COR     - "+Lorena.getcor());
		System.out.println("FAROL   - "+Lorena.getfarol());
		System.out.println("ACELERA - "+Lorena.getacelera());
		System.out.println("VIRA DIREITA  - "+Lorena.getviraL());
		System.out.println("VIRA ESQUERDA - "+Lorena.getviraR());
	}

}
