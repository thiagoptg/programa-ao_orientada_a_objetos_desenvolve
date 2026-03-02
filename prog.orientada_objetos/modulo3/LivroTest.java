import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void deveTestarGettersEDisponibilidade() {

        Autor autor = new Autor("Jess", "Brasileira");

        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        // Testando getters
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("tecnologia", livro1.getGenero());
        assertEquals(autor, livro1.getAutor());

        // Testando disponibilidade
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void deveAlterarDisponibilidade() {

        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", false);

        livro.setDisponivel(true);

        assertTrue(livro.isDisponivel());
    }
}