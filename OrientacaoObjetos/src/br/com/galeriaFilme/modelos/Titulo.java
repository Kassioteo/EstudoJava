package OrientacaoObjetos.src.br.com.galeriaFilme.modelos;


import OrientacaoObjetos.src.br.com.galeriaFilme.ferramentas.Classificao;
import OrientacaoObjetos.src.br.com.galeriaFilme.ferramentas.Genero;

public class Titulo {
    private String nome;
    private Genero genero;
    private int anoLancamento;
    private String sinopse;
    private int duracao;
    private Classificao classificao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Genero getGenero() {
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

    public void setClassificao(Classificao classificao) {
        this.classificao = classificao;
    }

    public Classificao getClassificao() {
        return classificao;
    }
}
