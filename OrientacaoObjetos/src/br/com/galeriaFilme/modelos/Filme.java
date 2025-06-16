package OrientacaoObjetos.src.br.com.galeriaFilme.modelos;

public class Filme extends Titulo {
    private String diretor;
    private Boolean cinema;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setCinema(Boolean cinema) {
        this.cinema = cinema;
    }

    public Boolean getCinema() {
        return cinema;
    }
}
