package Main;

import Service.Inventaris;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Inventaris service = new Inventaris();
            
            int pilihan = 0;
            do {
                System.out.println("\n===============================");
                System.out.println("       INVENTARIS DAPUR");
                System.out.println("===============================");
                System.out.println("1. Tambah Bahan");
                System.out.println("2. Lihat Inventaris");
                System.out.println("3. Update Bahan");
                System.out.println("4. Hapus Bahan");
                System.out.println("5. Cari Bahan");
                System.out.println("6. Keluar");
                System.out.println("===============================");
                System.out.print("Pilih menu (1-6): ");
                
                // Validasi input angka
                if (input.hasNextInt()) {
                    pilihan = input.nextInt();
                    input.nextLine(); // buang newline
                } else {
                    System.out.println("Input tidak valid, harus berupa angka!");
                    input.nextLine(); // bersihkan buffer
                    continue; // ulang ke menu
                }
                
                switch (pilihan) {
                    case 1 -> service.tambahBahan();
                    case 2 -> service.tampilInventaris();
                    case 3 -> service.updateBahan();
                    case 4 -> service.hapusBahan();
                    case 5 -> service.cariBahan();
                    case 6 -> System.out.println("\nTerima kasih! Program selesai.");
                    default -> System.out.println("Menu tidak valid. Silakan pilih 1-6.");
                }
            } while (pilihan != 6);
        }
    }
}
