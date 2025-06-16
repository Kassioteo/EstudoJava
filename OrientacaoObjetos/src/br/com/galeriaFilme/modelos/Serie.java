package OrientacaoObjetos.src.br.com.galeriaFilme.modelos;

public class Serie extends Titulo {
    private int quantidadeEpisodio;
    private int duracaoEpisodio;

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public int getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setQuantidadeEpisodio(int quantidadeEpisodio) {
        this.quantidadeEpisodio = quantidadeEpisodio;
    }

    public int getQuantidadeEpisodio() {
        return quantidadeEpisodio;
    }
}
