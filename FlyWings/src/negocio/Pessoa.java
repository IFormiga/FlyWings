package negocio;

abstract class Pessoa extends Entidade{
	/**
	 * 
	 */
	private static final long serialVersionUID = 626728217028800789L;
	private String nome;
	private String cpf;
	private	int idade;
	private String enderešo;
	private String sexo;
	
	public Pessoa(String nome, String cpf, int idade, String enderešo, String sexo){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.enderešo = enderešo;
		this.sexo = sexo;
	}
	public String getNome(){
		return this.nome;
	}
	public String getCpf(){
		return this.cpf;
	}
	public int getIdade(){
		return this.idade;
	}
	public String getEnderešo(){
		return this.enderešo;
	}
	public String getSexo(){
		return this.sexo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setEnderešo(String enderešo){
		this.enderešo = enderešo;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (enderešo == null) {
			if (other.enderešo != null)
				return false;
		} else if (!enderešo.equals(other.enderešo))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", enderešo=" + enderešo + ", sexo="
				+ sexo + "]";
	}
	
}
