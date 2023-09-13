import java.util.Scanner;

public class PhuongTrinhbac1 {

    public static void main(String[] args) {
        // Viết mã của bạn ở đây
        System.out.println("Giải Phương Trình Bậc 1");
        System.out.println("Cho phương trình 'a * x + b = c', vui lòng nhập các hằng số:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0) { // Nếu a khác 0
            double x = (c - b) / a; // Phương trình có nghiệm duy nhất x = (c-b)/a
            System.out.println("Phương trình có nghiệm với x = " + x);
        } else { // Trường hợp a = 0;
            if (b == c) { // Nếu b = c -> Phương trình có vô số nghiệm
                System.out.println("Nghiệm của phương trình là tất cả các giá trị của x!");
            } else { // Nếu b # c -> Phương trình vô nghiệm
                System.out.println("Không có nghiệm!");
            }
        }
    }
}