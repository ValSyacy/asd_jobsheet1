import java.util.Scanner;

public class Pemilihan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Hitung Nilai Akhir");
        System.out.println("Alfitroh Syacy Novalino (02)");
        System.out.println("================================");
        // Input nilai tugas
        System.out.print("Masukkan nilai tugas : ");
        int nilaiTugas = scanner.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai kuis : ");
        int nilaiKuis = scanner.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UTS : ");
        int nilaiUTS = scanner.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UAS : ");
        int nilaiUAS = scanner.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.4 * nilaiUAS;

        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("================================");
        System.out.println("================================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("================================");

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
}
