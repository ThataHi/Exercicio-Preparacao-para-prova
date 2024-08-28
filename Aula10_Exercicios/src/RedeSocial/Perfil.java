package RedeSocial;

public class Perfil {
    private String biografia;
    private String fotoPerfil;

    public Perfil() {
        this.biografia = "Esta é minha biografia.";
        this.fotoPerfil = "foto_padrao.jpg";
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
