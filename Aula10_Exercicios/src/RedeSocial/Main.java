package RedeSocial;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioNormal = new Usuario("teste123", "teste123", "teste@example.com");
        UsuarioPremium usuarioPremium = new UsuarioPremium("thais456", "senha456", "thais@example.com");
        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("admin123", "senha123", "admin@example.com");

        Postagem postagem1 = usuarioNormal.criarPostagem("Primeira postagem do Teste!");
        Postagem postagem2 = usuarioPremium.criarPostagem("Postagem em destaque da Thais!");

        postagem1.curtir();
        postagem1.curtir();
        postagem2.curtir();
        
        postagem1.adicionarComentario("Muito legal!");
        postagem1.adicionarComentario("Concordo!");

        exibirInformacoes("Teste", postagem1);
        exibirInformacoes("Thais", postagem2);

        usuarioAdmin.deletarPostagem(postagem1);
        usuarioAdmin.banirUsuario(usuarioNormal);

        Postagem postagem3 = usuarioPremium.criarPostagem("Outra postagem em destaque!");

        exibirInformacoes("Thais", postagem3);
    }

    private static void exibirInformacoes(String nomeUsuario, Postagem postagem) {
        System.out.println("Postagem do usuário " + nomeUsuario + ":");
        System.out.println("Conteúdo: " + postagem.getConteudo());
        System.out.println("Data de criação: " + postagem.getDataCriacao());
        System.out.println("Número de curtidas: " + postagem.getCurtidas());
        System.out.println("Comentários: " + postagem.getComentarios());
        System.out.println();
    }
}
