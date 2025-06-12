class Operadores {
 public static void main(String[] args) {
  int valor = 5;
  valor += 5;
  System.out.println(valor);
  if (true) {
    int num = 5;
int resultado = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
System.out.println(num); // imprime 6
System.out.println(resultado); // imprime 5
System.out.println(resultado); // imprime 6
  }
 }
}