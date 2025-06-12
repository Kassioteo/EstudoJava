import java.util.Scanner;

public class Index {
    private static String nome = "";
    private static String tipoBancario = "";
    private static int saldo = 0;

    public static String QuestLine (Scanner cliente, String titulo) {
        System.out.println(titulo);
        String resposta = cliente.nextLine();
        return resposta;
    }
    public static int QuestInt (Scanner cliente, String titulo) {
        System.out.println(titulo);
        int resposta = cliente.nextInt();
        return resposta;
    }
    public static Object Quest (Scanner cliente, String titulo,String type) {
        switch (type) {
            case "int":
                return QuestInt(cliente, titulo);
            case "str":
                return  QuestLine(cliente, titulo);
        }
        return null;
    }
    public static int Mainquest (String nome, Scanner cliente) {
        String LoginCliente = """
            Seja bem vindo %s
           --------------------
           Gostaria de fazer o que?
           -responta uma de nossas perguntas pre-definidas
           1- Consultar Saldo
           2- Consultar dados
           3- receber transferencia
           4- Transferir valor
           5- sair
        """.formatted(nome);
        return (int) Quest(cliente,LoginCliente,"int");
    }

    public static Boolean Response (
        int questNumber,
        Scanner cliente,
        String nome,
        String tipoBancario,
        int saldo
    ) {
        switch (questNumber) {
            case 1:
                System.out.println("""
                        seu saldo: 
                            %d
                        """.formatted(saldo));
                return true;
            case 2:
                System.out.println("""
                        seu dados: 
                            nome: %s
                            tipo de conta: %s
                        """.formatted(nome, tipoBancario));
                return true;
            case 3:
                int valorReceber = (int) Quest(cliente,"valor a receber: ", "int");
                saldo = saldo + valorReceber;
                System.out.println("""
                        seu saldo é: %d
                        """.formatted(saldo));
                return true;
            case 4:
                int valorTransferir = (int) Quest(cliente," valor a transferir: ", "int");
                if(valorTransferir <= saldo) {
                        saldo -= valorTransferir;
                        System.out.println("""
                            seu saldo é: %d
                            """.formatted(saldo));
                    }
                    System.out.println("Saldo insuficiente!!!");
                return true;
            case 5:
                System.out.println("Ate a proxima !!!");
                return false;
            default:
                System.out.println("""
                        opçáo invalida!!!
                        tente novamnerte!!!
                        """);
                return true;
        }      
    }
    
    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);

        System.out.println("Seja bem vindo, por favor informe seus dados:");

        nome = (String) Quest(cliente,"Qual o seu nome?","str");
        tipoBancario = (String) Quest(cliente,"Qual o seu tipo bancario?","str");
        saldo = (int) Quest(cliente,"Qual o seu saldo bancario?","int");

        Boolean resposta = true;
        while (resposta == true) {
        int pergunta = Mainquest(nome,cliente);
        resposta = Response(pergunta, cliente, nome, tipoBancario, saldo);
        }
    }

    
}