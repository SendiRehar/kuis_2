import java.util.Scanner;

public class Kuis21Sendi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int ParkirTerlama = 0;
        int nim = 97;
        int batas = (nim % 3) + 2;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();

        while (jam != 0) {
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
        
            if (jam < 0 || jam > 24) {
                System.out.println("Input tidak valid. Silakan masukkan jam parkir yang benar.");
                System.out.print("Lama parkir (jam, 0 = selesai): ");
                jam = sc.nextInt();
            
            }
            if (jam > 3) {
                jumlahKendaraan++;

            }
            if (ParkirTerlama < jam) {
                ParkirTerlama = jam;
            }
        jumlahKendaraan++;
        }
        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Jumlah kendaraan yang parkir lebih dari 3 jam: " + jumlahKendaraan);
        System.out.println("Parkir terlama: " + ParkirTerlama + " jam");
        System.out.println("NIM: " + nim);
        System.out.println("Batas: " + batas);

    }
}
