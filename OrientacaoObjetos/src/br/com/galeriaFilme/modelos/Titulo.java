package OrientacaoObjetos.src.br.com.galeriaFilme.modelos;

public class Titulo {
    private String nome;
    private String genero;
    private int anoLancamento;
    private String sinopse;
    private int duracao;
    private int classificao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setClassificao(int classificao) {
        this.classificao = classificao;
    }

    public int getClassificao() {
        return classificao;
    }
}
