package negocio;
import java.time.LocalDate;
import java.time.LocalTime;

public class Voo {
	private String nome_empresa;
	private int codigo_do_voo;
	private LocalTime saida;
	private LocalTime chegada;
	private LocalDate data_origem;
	private LocalDate data_destino;
	private String origem;
	private String destino;
	private String assentos[] = {"1A","2A","3A","1B","2B","3B"};
	private int num_assentos = assentos.length;
	
	public Voo(int hora_saida, int min_saida, int hora_chegada, int min_chegada, String origem, String destino, int ano1, int mes1, int dia1, int ano2, int mes2, int dia2, int codigo){
		this.origem = origem;
		this.destino = destino;
		this.saida = LocalTime.of(hora_saida, min_saida);
		this.chegada = LocalTime.of(hora_chegada, min_chegada);
		this.data_origem = LocalDate.of(ano1, mes1, dia1);
		this.data_destino = LocalDate.of(ano2, mes2, dia2);
		this.codigo_do_voo = codigo;
	}
	
	public int numAssentos(){
		return this.num_assentos;
	}
	
	public int getCodigo_do_voo() {
		return codigo_do_voo;
	}


	public String getNome_empresa() {
		return nome_empresa;
	}

	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}

	public void setCodigo_do_voo(int codigo_do_voo) {
		this.codigo_do_voo = codigo_do_voo;
	}



	public void mostrarAssentos(){
		for(int i = 0; i<6; ++i){
			if(this.assentos[i]!=null){
				System.out.println(this.assentos[i]);
			}
		}
	}
	public boolean escolherAssento(String assento){
		boolean r = false;
		for(int i = 0; i<6; ++i){
			if(this.assentos[i].equals(assento)){
				this.assentos[i] = null;
				r = true;
			}
		}
		return r;
	}
	
	public LocalTime getSaida() {
		return saida;
	}

	public void setSaida(LocalTime saida) {
		this.saida = saida;
	}

	public LocalTime getChegada() {
		return chegada;
	}

	public void setChegada(LocalTime chegada) {
		this.chegada = chegada;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	

	public LocalDate getData_origem() {
		return data_origem;
	}

	public void setData_origem(LocalDate data_origem) {
		this.data_origem = data_origem;
	}

	public LocalDate getData_destino() {
		return data_destino;
	}

	public void setData_destino(LocalDate data_destino) {
		this.data_destino = data_destino;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voo other = (Voo) obj;
		if (chegada == null) {
			if (other.chegada != null)
				return false;
		} else if (!chegada.equals(other.chegada))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (saida == null) {
			if (other.saida != null)
				return false;
		} else if (!saida.equals(other.saida))
			return false;
		return true;
	}

	public String toString() {
		return "Voo [saida=" + saida + ", chegada=" + chegada + ", data_origem=" + data_origem + ", data_destino="
				+ data_destino + ", origem=" + origem + ", destino=" + destino + "]";
	}	
	
	
}