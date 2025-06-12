import java.util.Scanner;

class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        if (senha.equals("Ka1703")) {
            System.out.println("Esse é a Galeria de Filme");
            String nomeFilme = "Um tira da pesada";
            int anoLancamento = 1998;
            boolean incluidoPlano = true;
            double notaKassio = 7.8;
            double notaStevann = 4.5;
            double notaPolly = 9.4;
            double media = (notaKassio + notaPolly + notaStevann) / 3;
            int classificacao = (int) (media / 2);
            String sinopse = "FILMAAOO DO CARALLHOOOOOOOOOO";
            System.out.println("""
                Filme : %s
                lançamento: %d
                Nota especialista: %.1f
                estrelas: %d
                Sinopse: %s
                """.formatted(nomeFilme, anoLancamento,media , classificacao, sinopse)
            );
        } else {
        System.out.println("nao foi possivel acessar");
        }
        
    }
}