import java.util.Scanner;

public class PhepTru {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so thu nhat: ");
            double so1 = scanner.nextDouble();
            System.out.print("Nhap so thu hai: ");
            double so2 = scanner.nextDouble();
            double hieu = so1 - so2;
            System.out.println("Hieu cua " + so1 + " - " + so2 + " = " - hieu);
        }
    }
}