import java.util.Scanner;

public class Vehinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        int chieuCao = scanner.nextInt();

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int chieuDai = scanner.nextInt();

        System.out.print("Nhập chiều cao của tam giác vuông: ");
        int chieuCaovuongduoi = scanner.nextInt();

        System.out.print("Nhập chiều cao của tam giác vuông: ");
        int chieuCaovuongtren = scanner.nextInt();

        System.out.print("Nhập chiều cao của hình trái tim: ");
        int chieuCaotraitim = scanner.nextInt();

        // Vẽ hình chữ nhật đơn giản
        System.out.println("Hình chữ nhật có chiều cao là "+ chieuCao +" chiều dài là " + chieuDai);
        for (int i = 1; i <= chieuCao; i++) {
            for (int j = 1; j <= chieuDai; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Vẽ hình tam giác vuông dưới
        System.out.println("Hình tam giác vuông có chiều cao là "+ chieuCaovuongduoi );
        for (int i = 1; i <= chieuCaovuongduoi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Vẽ hình tam giác vuông trên
        System.out.println("Hình tam giác vuông có chiều cao là "+ chieuCaovuongtren );
        for (int i = chieuCaovuongtren; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Vẽ hình trái tim vuông
        System.out.println("Hình trái tim có chiều cao là "+ chieuCaotraitim );
        for (int i = chieuCao / 2; i <= chieuCao; i += 2) {
            for (int j = 1; j < chieuCao - i; j += 2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= chieuCao - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Vẽ hình kim tự tháp ngược
        for (int i = chieuCao; i >= 1; i--) {
            for (int j = i; j < chieuCao; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }

}

