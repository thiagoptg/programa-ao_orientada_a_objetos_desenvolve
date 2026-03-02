import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class UsuarioTest {

    @Test
    public void deveTestarGettersEAdicionarEmprestimo() {

        Usuario usuario = new Usuario("Gabriel", 21);

        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);

        Emprestimo emprestimo = new Emprestimo(
                new Date(),
                new Date(),
                livro,
                usuario
        );

        usuario.adicionarEmprestimo(emprestimo);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
        assertEquals(1, usuario.getHistoricoEmprestimos().size());
        assertEquals(emprestimo, usuario.getHistoricoEmprestimos().get(0));
    }
}