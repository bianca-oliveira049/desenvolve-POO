package biblioteca;

public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private boolean disponivel;
	
	public Livro(String titulo, Autor autor, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.disponivel = true;
	}
	
	public void setTitulo(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	public void setAutor(Autor novoAutor) {
		this.autor = novoAutor;
	}
	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public String getGenero() {
		return this.genero;
	}
	
	public boolean isDisponivel() {
		return this.disponivel;
	}
	public void validaDisponibilidade() {
		if (this.disponivel) this.disponivel = false;
		else this.disponivel = true;
	}
	
	public void imprime() {
		System.out.println("Livro: " + this.titulo);
		System.out.println("Autor: " + this.autor.getNome());
		System.out.println("Genero: " + this.genero);
	}
}
