package RedeSocial;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    public void deletarPostagem(Postagem postagem) {
        // lógica para deletar a postagem
        System.out.println("Postagem deletada pelo administrador.");
    }

    public void banirUsuario(Usuario usuario) {
        // lógica para banir o usuário
        System.out.println("Usuário " + usuario.getNomeUsuario() + " banido.");
    }
}
