import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Khai báo và khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến để lưu trữ cân nặng, chiều cao và chỉ số BMI
        double canNang, chieuCao, bmi;

        // Yêu cầu người dùng nhập cân nặng và lưu giá trị vào biến "canNang"
        System.out.print("Cân nặng của bạn (trong kilogram):");
        canNang = scanner.nextDouble();

        // Yêu cầu người dùng nhập chiều cao và lưu giá trị vào biến "chieuCao"
        System.out.print("Chiều cao của bạn (trong mét):");
        chieuCao = scanner.nextDouble();

        // Tính chỉ số BMI bằng công thức BMI = cân nặng / (chiều cao * chiều cao)
        bmi = canNang / Math.pow(chieuCao, 2);

        // In tiêu đề cho kết quả và diễn giải
        System.out.printf("%-20s%s", "BMI", "Diễn giải\n");

        // Kiểm tra và in diễn giải dựa trên giá trị chỉ số BMI
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}