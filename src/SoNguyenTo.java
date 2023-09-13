public class SoNguyenTo {
    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la:");
        for (int i = 2; i < 100; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}