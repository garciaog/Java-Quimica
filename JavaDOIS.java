import java.util.Scanner;

public class JavaDOIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moles: ");
        double moles = scanner.nextDouble();
        System.out.print("Massa Molar: ");
        double massaMolar = scanner.nextDouble();
        double massa = moles * massaMolar;
        System.out.println("A massa é " + massa + " g");
    }
}
