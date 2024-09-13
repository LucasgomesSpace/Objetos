package poocpf;

public class PessoaCpf {
	
	String nome;
	int idade;
	String endereco;
	String profissao;
	String registro;
	long cpf ;
	
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getIdade () {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf (long cpf) {
		this.cpf = cpf;
	}
	public String getRG() {
		return registro;
	}
	public void setRG (String RG) {
		this.registro = RG;
	}
}