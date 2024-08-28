package RedeSocial;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem implements Curtivel {
    private Usuario autor;
    private String conteudo;
    private Date dataCriacao;
    private int curtidas;
    private List<String> comentarios;

    public Postagem(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataCriacao = new Date();
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    // Interface Curtivel
    @Override
    public void curtir() {
        curtidas++;
    }

    @Override
    public int getCurtidas() {
        return curtidas;
    }

    // Adicionar comentários
    public void adicionarComentario(String comentario) {
        comentarios.add(comentario);
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
}
