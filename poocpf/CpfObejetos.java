package poocpf;

public class CpfObejetos {

	public static void main(String[] args) {

		PessoaCpf pessoa1 = new PessoaCpf(); 
		PessoaCpf pessoa2 = new PessoaCpf();

		//OBJETO 1
		pessoa1.setNome ("Tom Cruise"); 
		pessoa1.setIdade (60); 
		pessoa1.setEndereco ("California, USA"); 
		pessoa1.setProfissao ("Ator");
		pessoa1.setCpf (47856958751l);
		pessoa2.setRG("58.858.967.D");

		//OBJETO 2
		pessoa2.setNome ("Messi");
		pessoa2.setIdade (35);
		pessoa2.setEndereco ("Miami, USA");
		pessoa2.setProfissao ("Jogador de Futebol");
		pessoa2.setCpf (47556958751l);
		pessoa2.setRG("58.858.868.X");
		//  Método get() para apresentar os objetos 

		System.out.println(" [ OBJETO 1 ]"); 
		System.out.println(pessoa1.getNome()); 
		System.out.println(pessoa1.getIdade()); 
		System.out.println(pessoa1.getEndereco()); 
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.registro);
		System.out.println("[  OBJETO 2 ]"); 
		System.out.println(pessoa2.getNome()); 
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.registro);

	}

}
