package entidades;

public class Filme extends Item{
	
	public Filme(entidades.Categoria categoria) {
		super(categoria);
		
	}
	private String diretor;
	private int duracao;
	
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
