
    import java.util.Scanner;

public class JavaUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massa (g): ");
        double massa = scanner.nextDouble();
        System.out.print("Massa Molar (g/mol): ");
        double massaMolar = scanner.nextDouble();
        double moles = massa / massaMolar;
        System.out.println("A quantidade de moles é " + moles);
    }
}

