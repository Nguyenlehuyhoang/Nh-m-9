package sprin.pkg1;

import java.util.Scanner;

public class TinhThanhTien {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số lượng: ");
            int quantity = scanner.nextInt();
            
            System.out.print("Nhập đơn giá: ");
            double unitPrice = scanner.nextDouble();
            
            double totalPrice = quantity * unitPrice;
            
            System.out.println("Thành tiền: " + totalPrice);
        }
    }
}
