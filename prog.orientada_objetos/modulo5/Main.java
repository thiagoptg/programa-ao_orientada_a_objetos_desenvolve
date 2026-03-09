public class Main {

    public static void main(String[] args) {

        // Criando um autor
        Autor autor = new Autor("Carlos Silva", "Brasileiro", true);

        // Criando um usuário
        Usuario usuario = new Usuario("Carlos Silva", 35);

        // Criando um livro
        Livro livro = new Livro("Java para Iniciantes", autor, "Tecnologia");

        // Criando um artigo
        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "Tecnologia",
                true
        );

        // Estratégia de publicação de livro
        EstrategiaPublicacaoLivro estrategiaLivro =
                new EstrategiaPublicacaoLivro(livro);

        usuario.setEstrategiaPublicacao(estrategiaLivro);
        usuario.publicar();

        // Trocar estratégia para artigo
        EstrategiaPublicacaoArtigo estrategiaArtigo =
                new EstrategiaPublicacaoArtigo(artigo);

        usuario.setEstrategiaPublicacao(estrategiaArtigo);
        usuario.publicar();

    }
}