package OrientacaoObjetos.src;

import OrientacaoObjetos.src.br.com.galeriaFilme.ferramentas.Favoritos;
import OrientacaoObjetos.src.br.com.galeriaFilme.modelos.Filme;

public class Aplicacao {
    public static void main(String[] args) {
        Favoritos user1 = new Favoritos();
    Filme mundoJack = new Filme();
    mundoJack.setCinema(true);
    mundoJack.setNome("Estranho Mundo De Jack");
    mundoJack.setGenero("Terror");
    mundoJack.setAnoLancamento(2001);
    mundoJack.setDuracao(180);
    mundoJack.setSinopse("monstros existem e sao macabros");
    mundoJack.setClassificao(16);
    mundoJack.setDiretor("Tim Burton");
        System.out.println(mundoJack.getDuracao());
        user1.incluirTitulo(mundoJack);
        System.out.println(user1.getTempoTotal());
        Filme mundoJack2 = new Filme();
        mundoJack2.setCinema(true);
        mundoJack2.setNome("Estranho Mundo De Jack");
        mundoJack2.setGenero("Terror");
        mundoJack2.setAnoLancamento(2001);
        mundoJack2.setDuracao(280);
        mundoJack2.setSinopse("monstros existem e sao macabros");
        mundoJack2.setClassificao(16);
        mundoJack2.setDiretor("Tim Burton");
        System.out.println(mundoJack2.getDuracao());
        user1.incluirTitulo(mundoJack2);
        System.out.println(user1.getTempoTotal());
    }

}
