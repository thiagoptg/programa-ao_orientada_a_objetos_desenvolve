import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void deveCriarArtigoPublicado() {

        Autor autor = new Autor("Alan Turing", "Inglês", false);

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "tecnologia",
                true
        );

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void deveCriarArtigoNaoPublicado() {

        Autor autor = new Autor("Jess", "Brasileira", true);

        Artigo artigo = new Artigo(
                "Java Moderno",
                autor,
                "tecnologia",
                false
        );

        assertFalse(artigo.isPublicado());
    }
}