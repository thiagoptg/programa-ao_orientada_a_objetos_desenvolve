import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void deveTestarGettersEAdicionarLivro() {

        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);

        autor.adicionarLivro(livro);

        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
        assertEquals(1, autor.getObrasPublicadas().size());
        assertEquals(livro, autor.getObrasPublicadas().get(0));
    }
}