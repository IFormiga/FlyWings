package exceptions;

public class HEException extends Exception {

	public String enderešo;
	public String cep;
	public String nome;
	
	
	public HEException(String enderešo, String cEP, String nome) {
		super("Hotel ja existe");
		this.enderešo = enderešo;
		this.cep = cEP;
		this.nome = nome;
		
	}
	
	
	
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getCEP() {
		return cep;
	}
	public void setCEP(String cEP) {
		cep = cEP;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}
