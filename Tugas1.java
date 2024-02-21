import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        System.out.println("=========================");
        System.out.println("Program Mencari Kode Plat Nomor");
        System.out.println("Alfitroh Syacy Novalino (02)");
        System.out.println("=========================");
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Surabaya"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().charAt(0);

        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Kota yang berpasangan dengan kode plat " + inputKode + " adalah: " + KOTA[index][0]);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }
}
