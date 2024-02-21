import java.util.Scanner;

public class Tugas2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Program Rumus Mengitung");
        System.out.println("Alfitroh Syacy Novalino (02)");
        System.out.println("=========================");

        int pilihan;
        do {
            menu();
            System.out.print("Pilih rumus (1-3, 0 untuk keluar): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);
    }

    public static void menu() {
        System.out.println("===== Menu Rumus Fisika =====");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("0. Keluar");
        System.out.println("=============================");
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak + " meter");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu + " detik");
    }
}
