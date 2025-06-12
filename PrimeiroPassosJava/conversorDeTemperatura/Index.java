import java.util.Scanner;

class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 conversor de celsius & Fahrenheit
                 ---------------------------------
                 digite o valor a ser convertido:
                 """);
        int valorConverter = scanner.nextInt();
        System.out.println("""
            ---------------------------------
                equivale a : %.1f
                """.formatted((valorConverter * 1.8) + 32)
        );

    }
}
