package OrientacaoObjetos.src.br.com.galeriaFilme.ferramentas;

import OrientacaoObjetos.src.br.com.galeriaFilme.modelos.Titulo;

public class Favoritos {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluirTitulo (Titulo titulo) {
         tempoTotal += titulo.getDuracao();
    }
}
