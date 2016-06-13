package negocio;

public class Hotel {

	public String endere�o;
	public String CEP;
    public String nomeHotel;
    public boolean quartoDisp;
    public Quarto quarto;
    
    // Necessita criar referencia para quartos
    
    
	
    public Hotel(String endere�o, String cEP, String nome_hotel,boolean quarto_disp) {
		
		this.endere�o = endere�o;
		CEP = cEP;
		this.nomeHotel = nome_hotel;
		this.quartoDisp = quarto_disp;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNome_Hotel() {
		return nomeHotel;
	}
	public void setNome(String nome) {
		this.nomeHotel = nome;
	} 
    
    public boolean disponibilidadequarto(Quarto quarto)
    {
    	if(quarto != null)
    	{
    		quartoDisp = quarto.statusQuarto(quarto.getnumeroQuarto());
    		return quartoDisp;
    	}
    	else
    	{
    		quartoDisp = false; 
    		return quartoDisp;
    		// quarto n�o existe
    	}
    }
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (CEP != other.CEP)
			return false;
		if (endere�o == null) {
			if (other.endere�o != null)
				return false;
		} else if (!endere�o.equals(other.endere�o))
			return false;
		if (nomeHotel == null) {
			if (other.nomeHotel != null)
				return false;
		} else if (!nomeHotel.equals(other.nomeHotel))
			return false;
		return true;
	}
	
	
	public String toString() {
		return "Hotel [endere�o=" + endere�o + ", CEP=" + CEP + ", nome_hotel="
				+ nomeHotel + ", quarto_disp=" + quartoDisp + "]";
	}
	
    
	
}