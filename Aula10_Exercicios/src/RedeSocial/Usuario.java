package RedeSocial;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Perfil perfil;

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.perfil = new Perfil();
    }

    // Getters e Setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        // Aqui você pode adicionar uma lógica de validação de senha
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    // Método para criar postagens (pode ser sobrescrito por subclasses)
    public Postagem criarPostagem(String conteudo) {
        return new Postagem(this, conteudo);
    }
}
