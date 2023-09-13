import java.util.Scanner;

public class Inra5sochan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // Biến đếm số chẵn đã nhập
        int number; // Biến lưu trữ số nhập từ bàn phím

        System.out.println("Nhập 5 số chẵn:");

        while (count < 5) {
            System.out.print("Nhập số thứ " + (count + 1) + ": ");
            number = scanner.nextInt();

            if (number % 2 == 0) { // Kiểm tra xem số có phải là số chẵn không
                System.out.println("Số chẵn: " + number);
                count++;
            } else {
                System.out.println("Số bạn vừa nhập không phải số chẵn. Hãy nhập lại.");
            }
        }

        scanner.close(); // Đóng Scanner sau khi sử dụng
    }
}
