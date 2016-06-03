package exceptions;

public class HEException extends Exception {

	
	public HEException(String enderešo, String cEP, String nome,
			boolean quarto_disp) {
		super("Hotel ja existe");
		this.enderešo = enderešo;
		this.CEP = cEP;
		this.nome = nome;
		this.quarto_disp = quarto_disp;
	}
	public String enderešo;
	public String CEP;
	public String nome;
	public boolean quarto_disp;
	
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isQuarto_disp() {
		return quarto_disp;
	}
	public void setQuarto_disp(boolean quarto_disp) {
		this.quarto_disp = quarto_disp;
	}
	
	
	
	
}
