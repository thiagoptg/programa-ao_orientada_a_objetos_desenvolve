import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {

    private String nacionalidade;
    private boolean ehUsuario;
    private List<Livro> obrasPublicadas;

    public Autor(String nome, String nacionalidade, boolean ehUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isEhUsuario() {
        return ehUsuario;
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void adicionarLivro(Livro livro) {
        obrasPublicadas.add(livro);
    }
}