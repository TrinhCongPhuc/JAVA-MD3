import java.util.Scanner;
public class Nhapsovatinhtong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        String soString = ""; // Chuỗi để lưu các số bạn đã nhập
        System.out.println("Nhập các số vào bàn phím, nhập số 0 để kết thúc.");
        while (true) {
            System.out.println("Nhập số (hoặc 0 để tính tổng): ");
            int so = Integer.parseInt(scanner.nextLine());
            if (so == 0) {
                break;
            }
            tong += so;
            soString += so + " + ";
        }
        if (!soString.isEmpty()) {
            soString = soString.substring(0, soString.length() - 3); // Loại bỏ dấu + cuối cùng
            System.out.println("Tổng các số " + soString + " là: " + tong);
        } else {
            System.out.println("Bạn chưa nhập số nào.");
        }
        scanner.close();
    }
}
//import java.util.Scanner;
//
//public class Nhapsovatinhtong {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int tong = 0;
//        System.out.println("Nhập các số vào bàn phím, nhập số 0 để kết thúc.");
//        while (true){
//            System.out.println("Nhập số: ");
//            int so = Integer.parseInt(scanner.nextLine());
//            if (so == 0){
//                break;
//            } tong+=so;
//        }
//        System.out.println("Tổng các số đã nhập là :"+tong);
//        scanner.close();
//    }
//
//}
