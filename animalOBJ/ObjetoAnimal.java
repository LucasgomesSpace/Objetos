package animalOBJ;

public class ObjetoAnimal {

	public static void main(String[] args) {
		
		Animal bixo1 = new Animal();
		Animal bixo2 = new Animal();
		Animal bixo3 = new Animal();
		Animal bixo4 = new Animal();
		Animal bixo5 = new Animal();
		Animal bixo6 = new Animal();

		bixo1.setespecie("Vaca");
		bixo1.setpeso(600);
		bixo1.setporte("Grnde");
		bixo1.setpreço(8200);
		bixo1.setsom("Mujido");

		bixo2.setespecie("Bezerro");
		bixo2.setpeso(25);
		bixo2.setporte("Pequeno");
		bixo2.setpreço(210);
		bixo2.setsom("Mujido");

		bixo3.setespecie("Ovelha");
		bixo3.setpeso(5);
		bixo3.setporte("Pequeno");
		bixo3.setpreço(600);
		bixo3.setsom("Balido");

		bixo4.setespecie("Cachorro");
		bixo4.setpeso(7);
		bixo4.setporte("Pequeno");
		bixo4.setpreço(2000);
		bixo4.setsom("Latido");

		bixo5.setespecie("Coelho");
		bixo5.setpeso(4);
		bixo5.setporte("Pequeno");
		bixo5.setpreço(350);
		bixo5.setsom("Chiado");

		bixo6.setespecie("Galinha");
		bixo6.setpeso(2);
		bixo6.setporte("Pequeno");
		bixo6.setpreço(20);
		bixo6.setsom("Cacarejo");

		System.out.println("Animal 1: "+bixo1.getespecie());
		System.out.println(bixo1.getespecie());
		System.out.println(bixo1.getpeso()+" kg");
		System.out.println(bixo1.getporte());
		System.out.println("R$"+bixo1.getpreço());
		System.out.println(bixo1.getsom());
		System.out.println(" ");

		System.out.println("Animal 2: "+bixo2.getespecie());
		System.out.println(bixo2.getespecie());
		System.out.println(bixo2.getpeso()+" kg");
		System.out.println(bixo2.getporte());
		System.out.println("R$"+bixo2.getpreço());
		System.out.println(bixo2.getsom());
		System.out.println(" ");

		System.out.println("Animal 3: "+bixo3.getespecie());
		System.out.println(bixo3.getespecie());
		System.out.println(bixo3.getpeso()+" kg");
		System.out.println(bixo3.getporte());
		System.out.println("R$"+bixo3.getpreço());
		System.out.println(bixo3.getsom());
		System.out.println(" ");

		System.out.println("Animal 4: "+bixo4.getespecie());
		System.out.println(bixo4.getespecie());
		System.out.println(bixo4.getpeso()+" kg");
		System.out.println(bixo4.getporte());
		System.out.println("R$"+bixo4.getpreço());
		System.out.println(bixo4.getsom());
		System.out.println(" ");

		System.out.println("Animal 5: "+bixo5.getespecie());
		System.out.println(bixo5.getespecie());
		System.out.println(bixo5.getpeso()+" kg");
		System.out.println(bixo5.getporte());
		System.out.println("R$"+bixo5.getpreço());
		System.out.println(bixo5.getsom());
		System.out.println(" ");

		System.out.println("Animal 6: "+bixo6.getespecie());
		System.out.println(bixo6.getespecie());
		System.out.println(bixo6.getpeso()+" kg");
		System.out.println(bixo6.getporte());
		System.out.println("R$"+bixo6.getpreço());
		System.out.println(bixo6.getsom());
		System.out.println(" ");
	}

}