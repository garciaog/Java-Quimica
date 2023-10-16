import java.util.Scanner;
public class javaDEZESSEIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número real: ");
        double numero = scanner.nextDouble();

        double valorAbsoluto = Math.abs(numero);
        System.out.println("O valor absoluto de " + numero + " é " + valorAbsoluto + ".");
    }
}
