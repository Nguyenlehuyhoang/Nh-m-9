
package sprin.pkg1;


import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số đầu của đồng hồ nước: ");
            double startReading = scanner.nextDouble();
            
            System.out.print("Nhập số cuối của đồng hồ nước: ");
            double endReading = scanner.nextDouble();
            
            if (endReading >= startReading) {
                double consumption = endReading - startReading;
                double pricePerUnit = 5000; // Đơn giá nước mỗi m³
                double totalCost = consumption * pricePerUnit;
                
                System.out.println("Lượng nước tiêu thụ: " + consumption + " m³");
                System.out.println("Thành tiền: " + totalCost + " VND");
            } else {
                System.out.println("Lỗi: Số cuối phải lớn hơn hoặc bằng số đầu!");
            }
        }
    }
}

