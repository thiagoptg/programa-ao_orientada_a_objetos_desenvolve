public class Livro {

    private String titulo;
    private String genero;
    private Autor autor;
    private boolean disponivel;

    public Livro(String titulo, String genero, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.disponivel = false; // para imprimir "O livro não está disponível"
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade() {
        if (!disponivel) {
            System.out.println("O livro não está disponível");
        }
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}