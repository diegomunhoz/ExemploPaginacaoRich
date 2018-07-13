package br.com.choice.paginacao.backingbean;
import java.util.List;

import br.com.choice.paginacao.dao.GenericDAO;
import br.com.choice.paginacao.model.Curso;
import br.com.choice.paginacao.util.JSFUtil;

public class CursoBacking{
	private Curso curso = new Curso();
	private Curso cursoSelecionado = new Curso();
	private int codigo;
	private String genero;
	private String nome;
	private String disponivel;
	private double valor;
	private List<Curso> listaCurso;
	private int scrollerPage; 
	
	/** Métodos de mapeamento para menu*/
	public String consultarMenu(){
		try {
			scrollerPage = 1;
			listaCurso = new GenericDAO().buscarTodos();
		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro na busca.");
		}
		return "";
	}
	
	/** Método para efetuar consulta de cursos*/
	public String cursoPesquisar(){
		return "";
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public List<Curso> getListaCurso() {
		return listaCurso;
	}
	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}

	public Curso getCursoSelecionado() {
		return cursoSelecionado;
	}

	public void setCursoSelecionado(Curso cursoSelecionado) {
		this.cursoSelecionado = cursoSelecionado;
	}
	public int getScrollerPage() {
		return scrollerPage;
	}
	public void setScrollerPage(int scrollerPage) {
		this.scrollerPage = scrollerPage;
	}
}