package negocio;

import java.util.List;

import exceptions.JaExisteVooNesseHorarioException;
import exceptions.PassagemJaExisteException;
import exceptions.PassagemNaoExisteException;
import exceptions.VooJaExisteException;
import exceptions.VooNaoExisteException;

public interface IFlyRoads {
	public abstract void cadastrarEmpresa(Empresa empresa);

	public abstract void venderPassagem(Passagem passagem) throws PassagemJaExisteException;

	public abstract void cadastrarVoo(Voo voo) throws VooJaExisteException, JaExisteVooNesseHorarioException;
	
	public abstract void cadastrarUsuario(Usuario user);

	public abstract void CadastrarViagemOnibus(ViagemOnibus viagem);
	
	//REMOVER
	
	public abstract void removerEmpresa(String nomeDaEmpresaString, String cnpj);

	public abstract void removerPassagem(Passagem passagem) throws PassagemNaoExisteException, PassagemJaExisteException;

	public abstract void removerVoo(Voo v);
	
	public abstract void removerUsuario(String cpf);

	public abstract void removerViagemOnibus(String codigo);

	//ALTERAR
	public abstract void alterarEmpresa(Empresa e1, Empresa e2);

	public abstract void alterarPassagem(Passagem passagemAlterada, Passagem passagem) throws PassagemNaoExisteException;

	public abstract void alterarVoo(Voo vooAlterado, Voo voo);

	public abstract void alterarUsuario(Usuario aSerAlterado, Usuario alterado);

	public abstract void alterarViagemOnibus(ViagemOnibus v1, ViagemOnibus v2);
	
	//PROCURAR
	public abstract Empresa procurarEmpresa(String nomeDaEmpresa, String cnpj);

	public abstract Passagem procurarPassagem(String cod) throws PassagemNaoExisteException;

	public abstract Voo procurarVoo(int cod) throws VooNaoExisteException;

	public abstract Usuario procurarUsuario(String cpf);

	public abstract ViagemOnibus procurarViagemOnibus(String codigo);

	// LISTAR
	public abstract List<Empresa> listaEmpresas();

	public abstract List<Passagem> listaPassagens();

	public abstract List<Voo> listaVoos();

	public abstract List<Usuario> listaUsuarios();

	public abstract List<ViagemOnibus> listaViagensOnibus();

}
