package RedeSocial;

public class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    @Override
    public Postagem criarPostagem(String conteudo) {
        // marcação simples
        Postagem postagem = super.criarPostagem(conteudo);
        System.out.println("Postagem em destaque criada!");
        return postagem;
    }
}
