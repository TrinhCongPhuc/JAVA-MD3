import java.util.Scanner;
public class LeafYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.println("Nhập một năm: ");
        nam = scanner.nextInt();
        boolean laNamNhuan = false;

        boolean chiaHetCho4 = nam % 4 == 0;
        if (chiaHetCho4) {
            boolean chiaHetCho100 = nam % 100 == 0;
            if (chiaHetCho100) {
                boolean chiaHetCho400 = nam % 400 == 0;
                if (chiaHetCho400) {
                    laNamNhuan = true;
                }
            } else {
                laNamNhuan = true;
            }
        }
        if (laNamNhuan) {
            System.out.printf("%d là năm nhuận", nam);
        } else {
            System.out.printf("%d không phải là năm nhuận", nam);
        }
    }
}
