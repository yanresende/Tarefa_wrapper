import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        Integer numeroConvertido = numero;
        System.out.println("Você digitou: " + numeroConvertido);
        scanner.close();
    }

}