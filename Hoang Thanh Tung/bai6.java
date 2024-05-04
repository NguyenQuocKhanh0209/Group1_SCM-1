/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group1;

/**
 *
 * @author leanh
 */
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập tháng
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        
        // Kiểm tra năm nhuận
        boolean isLeapYear = false;
        if (month == 2) {
            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        
        // Tính số ngày trong tháng
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ.");
                return;
        }
        
        // In kết quả
        System.out.println("Tháng " + month + " có " + days + " ngày.");
        
        // Đóng Scanner
        scanner.close();
    }
}

