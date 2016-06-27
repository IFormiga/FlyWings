package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocio.Voo;
public class RepositorioVoos implements IRepositorioVoo{
	private List<Voo> listaVoos;
	private static RepositorioVoos instance;
	
	//lista de passageiros pra usar nas regras de negocio
	
	public RepositorioVoos(){
		this.listaVoos = new ArrayList<Voo>();
	}
	
	public static RepositorioVoos getInstance(){
	    if (instance == null) {
		      instance = lerDoArquivo();
		    }
		    return instance;
	}
	
	public boolean cadastrarVoo(Voo voo){
		try{
			listaVoos.add(voo);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	public boolean removerVoo(int codigo_do_voo){
		int cod;
		boolean r = false;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
				listaVoos.remove(voo2);
				r = true;
			}
		}
		return r;
	}
	public List<Voo> listaVoos(){
		return Collections.unmodifiableList(this.listaVoos);
	}
	
	public Voo procurarVoo(int codigo_do_voo){
		int cod;
		Voo r = null;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
				r = voo2;
			}
		}
		return r;
	}
	
	public boolean existe(int codigo_do_voo){
		int cod;
		boolean r = false;
		for(Voo voo2 : listaVoos){
			cod = voo2.getCodigo_do_voo();
			if(cod == codigo_do_voo){
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
	
	public void alterarVoo(Voo a_ser_alterado, Voo alterado){
		for(Voo voo2 : listaVoos){
			if(voo2.getCodigo_do_voo() == a_ser_alterado.getCodigo_do_voo()){
				listaVoos.remove(voo2);
				listaVoos.add(alterado);
			}
		}
	}
	
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
	
}
