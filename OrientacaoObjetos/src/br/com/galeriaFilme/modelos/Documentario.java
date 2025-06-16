package OrientacaoObjetos.src.br.com.galeriaFilme.modelos;

public class Documentario extends Titulo {
    private String tema;
    private String produtora;

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getProdutora() {
        return produtora;
    }
}
