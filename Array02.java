import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("Alfitroh Syacy Novalino (02)");
        System.out.println("=========================");

        double totalSKS = 0;
        double totalBobotNilai = 0;

        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};

        double[] nilaiAngka = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            // Konversi nilai angka
            String nilaiHuruf = konversiNilaiAngka(nilaiAngka[i]);
            double bobotNilai = getBobotNilai(nilaiAngka[i]);

            // Menambahkan ke total
            totalBobotNilai += bobotNilai;
            totalSKS += 1; 
        }

        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-40s%-20s%-20s\n", "Mata Kuliah", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            String mk = mataKuliah[i];
            double nilaiHuruf = nilaiAngka[i];
            String konversiNilaiHuruf = konversiNilaiAngka(nilaiHuruf);
            double bobotNilai = getBobotNilai(nilaiHuruf);

            System.out.printf("%-40s%-20s%-20.2f\n", mk, konversiNilaiHuruf, bobotNilai);
        }

        double ipSemester = totalBobotNilai / totalSKS;

        System.out.println("===========================");
        System.out.printf("IP : %.2f\n", ipSemester);
    }

    public static String konversiNilaiAngka(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return "A";
        } else if (nilaiAngka > 73) {
            return "B+";
        } else if (nilaiAngka > 65) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C+";
        } else if (nilaiAngka > 50) {
            return "C";
        } else if (nilaiAngka > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double getBobotNilai(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return 4.00;
        } else if (nilaiAngka > 73) {
            return 3.50;
        } else if (nilaiAngka > 65) {
            return 3.00;
        } else if (nilaiAngka > 60) {
            return 2.50;
        } else if (nilaiAngka > 50) {
            return 2.00;
        } else if (nilaiAngka > 39) {
            return 1.00;
        } else {
            return 0.00;
        }
    }
}
