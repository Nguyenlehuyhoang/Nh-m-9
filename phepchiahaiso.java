
package sprin1;

import java.util.Scanner;

public class phepchiahaiso {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số bị chia: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Nhập số chia: ");
            double num2 = scanner.nextDouble();
            
            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println("Kết quả phép chia: " + result);
            } else {
                System.out.println("Lỗi: Không thể chia cho 0!");
            }
        }
    }
}
