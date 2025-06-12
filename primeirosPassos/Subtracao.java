import java.util.Scanner;

class Subtracao {
 public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);
    System.out.println("Digite os valores");
    System.out.println("--------------------");
     Integer value1 = scanner.nextInt();
     Int value2 = scanner.nextInt();
    System.out.println("--------------------");
    Number soma = value1 - value2;
    System.out.println("TOTAL = " + soma);
 }
}