package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Voo;
public class RepositorioVoos implements IRepositorioVoo{
	private List<Voo> listaVoos;
	private static RepositorioVoos instance;
	
	//lista de passageiros pra usar nas regras de negocio
	
	private RepositorioVoos(){
		this.listaVoos = new ArrayList<Voo>();
	}
	
	public static RepositorioVoos getInstance(){
	    if (instance == null) {
		      instance = new RepositorioVoos();
		    }
		    return instance;
	}
	
	public boolean cadastrar(Voo voo){
		try{
			listaVoos.add(voo);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	public boolean remover(int codigoDoVoo){
		int cod;
		boolean r = false;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigoDoVoo();
			if(cod == codigoDoVoo){
				listaVoos.remove(voo2);
				r = true;
			}
		}
		return r;
	}
	public List<Voo> listar(){
		return Collections.unmodifiableList(this.listaVoos);
	}
	
	public Voo procurar(int codigoDoVoo){
		int cod;
		Voo r = null;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigoDoVoo();
			if(cod == codigoDoVoo){
				r = voo2;
			}
		}
		return r;
	}
	
	public boolean existe(int codigoDoVoo){
		int cod;
		boolean r = false;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigoDoVoo();
			if(cod == codigoDoVoo){
				r = true;	
			}
		}
		return r;
	}
	
	public boolean verificaHorario(Voo v){
		boolean verificacao = false;
		for(Voo voo : listaVoos){
			if((v.getOrigem().equals(voo.getOrigem()) && v.getSaida().equals(voo.getSaida())) || (v.getDestino().equals(voo.getDestino()) && v.getChegada().equals(voo.getChegada()))){
				verificacao = true;
			}
		}
		return verificacao;
	}
	
	public void alterar(Voo alterado){
		for(Voo voo2 : listaVoos){
			if(voo2.getCodigoDoVoo() == alterado.getCodigoDoVoo()){
				listaVoos.remove(voo2);
				listaVoos.add(alterado);
			}
		}
	}
	/*
	public void salvarArquivo() {

		if (instance == null) {
		      return;
		    }

		    File arqVoos = new File("RepositorioVoos.dat");
		    FileOutputStream fos = null;
		    ObjectOutputStream oos = null;

		    try {
		      fos = new FileOutputStream(arqVoos);
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(instance);
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      if (oos != null) {
		        try {
		          oos.close();
		        } catch (IOException e) {
		          }
		      }
		    }
		  }
	
	private static RepositorioVoos lerDoArquivo() {
		RepositorioVoos instanciaLocal = null;

	    File arqVoos = new File("RepositorioVoos.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	    try {
	      fis = new FileInputStream(arqVoos);
	      ois = new ObjectInputStream(fis);
	      Object o = ois.readObject();
	      instanciaLocal = (RepositorioVoos) o;
	    } catch (Exception e) {
	      instanciaLocal = new RepositorioVoos();
	    } finally {
	      if (ois != null) {
	        try {
	          ois.close();
	        } catch (IOException e) {
	        }
	      }
	    }

	    return instanciaLocal;
	  }
	  */
	
}
