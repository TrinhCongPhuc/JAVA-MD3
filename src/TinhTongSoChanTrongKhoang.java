import java.util.Scanner;

public class TinhTongSoChanTrongKhoang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập khoảng số từ người dùng
        System.out.print("Nhập giá trị đầu của khoảng: ");
        int start = scanner.nextInt();

        System.out.print("Nhập giá trị cuối của khoảng: ");
        int end = scanner.nextInt();
//        int end = Integer.parseInt(scanner.nextLine());

        // Biến để lưu tổng các số chẵn
        int tong = 0;
        String chuoiso="";

        // Bước 2: Sử dụng vòng lặp for để tính tổng các số chẵn trong khoảng
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                tong += i;
                chuoiso+= i + "";
            }
        }

        // Bước 3: Hiển thị tổng các số chẵn ra màn hình
        System.out.println("Tổng các số chẵn "+ chuoiso + "trong khoảng từ " + start + " đến " + end + " là: " + tong);

        // Đóng Scanner
        scanner.close();
    }
}
