import java.util.Scanner;

class Perfil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o seu nome?");
        String nome = scanner.nextLine();
       System.out.println("Seja bem vindo " + nome);
    }
}