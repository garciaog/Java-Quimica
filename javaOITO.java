    import java.util.Scanner;
public class javaOITO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a distância percorrida em metros: ");
        double distancia = scanner.nextDouble();
        System.out.print("Entre com o tempo gasto em segundos: ");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        System.out.println("A velocidade média é " + velocidadeMedia + " m/s.");
    }
}
