import java.util.Scanner;

public class JavaTRÊS {
    
    public static void   main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Configuração Eletrônica: ");
        String configuracaoEletronica = scanner.nextLine();
        int eletronsCamadaValencia = 2;
        System.out.println("O átomo possui " + eletronsCamadaValencia + " elétrons na camada de valência");
    }
}
