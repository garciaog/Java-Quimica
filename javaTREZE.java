import java.util.Scanner;
public class javaTREZE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o comprimento da aresta do cubo em cm: ");
        double aresta = scanner.nextDouble();

        double volume = aresta * aresta * aresta;
        System.out.println("O volume do cubo é " + volume + " cm³.");
    }
}
