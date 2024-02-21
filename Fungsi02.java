import java.util.Scanner;

public class Fungsi02 {

    static int[][] stockBunga = {
        {10, 15, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    static void pendapatanPerCabang() {
        int totalPendapatan = 0;

        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = 0;

            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanCabang += stockBunga[i][j] * hargaBunga[j];
            }

            totalPendapatan += pendapatanCabang;
            System.out.println("Pendapatan Cabang " + (i + 1) + ": Rp" + pendapatanCabang);
        }

        System.out.println("Total Pendapatan Semua Cabang: Rp" + totalPendapatan);
    }

    static void jumlahStockBunga() {
        for (int i = 0; i < hargaBunga.length; i++) {
            int totalStockBunga = 0;

            for (int j = 0; j < stockBunga.length; j++) {
                totalStockBunga += stockBunga[j][i];
            }

            System.out.println("Jumlah Stock " + getJenisBunga(i) + " di Semua Cabang: " + totalStockBunga);
        }
    }

    static void kurangiStockBunga(int indexAglonema, int indexKeladi, int indexAlocasia, int indexMawar) {
        if (isValidIndex(indexAglonema, indexKeladi, indexAlocasia, indexMawar)) {
            System.out.println("\nJumlah Stok Bunga yang Mati:");
            System.out.println("Aglonema: -" + indexAglonema);
            System.out.println("Keladi: -" + indexKeladi);
            System.out.println("Alocasia: -" + indexAlocasia);
            System.out.println("Mawar: -" + indexMawar);

            stockBunga[0][0] -= indexAglonema;
            stockBunga[1][1] -= indexKeladi;
            stockBunga[2][2] -= indexAlocasia;
            stockBunga[3][3] -= indexMawar;

            System.out.println("\nPengurangan Stock Bunga karena Bunga Mati Berhasil Dilakukan.");
        } else {
            System.out.println("\nPengurangan Stock Bunga Tidak Valid.");
        }
    }

    static String getJenisBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "Jenis Bunga Tidak Dikenal";
        }
    }

    static boolean isValidIndex(int... indexes) {
        for (int index : indexes) {
            if (index < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Program Menghitung Stock Bunga");
        System.out.println("Alfitroh Syacy Novalino (02)");
        System.out.println("=========================");

        System.out.println("Apakah ada informasi pengurangan stok bunga? (y/n)");
        char pilihan = scanner.next().charAt(0);

        if (pilihan == 'y' || pilihan == 'Y') {
            System.out.println("Masukkan jumlah stok bunga yang mati:");
            System.out.print("Aglonema: ");
            int indexAglonema = scanner.nextInt();
            System.out.print("Keladi: ");
            int indexKeladi = scanner.nextInt();
            System.out.print("Alocasia: ");
            int indexAlocasia = scanner.nextInt();
            System.out.print("Mawar: ");
            int indexMawar = scanner.nextInt();

            kurangiStockBunga(indexAglonema, indexKeladi, indexAlocasia, indexMawar);

            System.out.println("\nJumlah Stock Bunga Setelah Pengurangan:");
            jumlahStockBunga();
        } else {
            pendapatanPerCabang();
            System.out.println("\n==============================\n");
            jumlahStockBunga();
        }
    }
}
