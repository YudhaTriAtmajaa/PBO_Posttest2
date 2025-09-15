package Service;

import Model.Bahan;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventaris {
    private final ArrayList<Bahan> inventaris = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    // Tambah data awal
    public Inventaris() {
        inventaris.add(new Bahan("Beras", 10, "kg", "01-12-2025"));
        inventaris.add(new Bahan("Minyak Goreng", 5, "liter", "15-10-2025"));
        inventaris.add(new Bahan("Telur", 30, "pcs", "20-09-2025"));
        inventaris.add(new Bahan("Gula Pasir", 8, "kg", "05-01-2026"));
        inventaris.add(new Bahan("Tepung Terigu", 12, "kg", "10-11-2025"));
    }

    // CREATE
    public void tambahBahan() {
        System.out.println("\n--- Tambah Bahan Baru ---");
        System.out.print("Nama Bahan          : ");
        String nama = input.nextLine();
        int stok = validasiAngka("Jumlah Stok         : ");
        System.out.print("Satuan (kg/liter/pcs): ");
        String satuan = input.nextLine();
        System.out.print("Tanggal Kadaluarsa  : ");
        String kadaluarsa = input.nextLine();

        inventaris.add(new Bahan(nama, stok, satuan, kadaluarsa));
        System.out.println("Bahan berhasil ditambahkan!");
    }

    // READ
    public void tampilInventaris() {
        System.out.println("\n--- Daftar Inventaris ---");
        if (inventaris.isEmpty()) {
            System.out.println("Inventaris masih kosong.");
        } else {
            System.out.printf("%-4s %-20s %-10s %-8s %-15s\n",
                    "No", "Nama Bahan", "Stok", "Satuan", "Kadaluarsa");
            System.out.println("-------------------------------------------------------");
            for (int i = 0; i < inventaris.size(); i++) {
                Bahan b = inventaris.get(i);
                System.out.printf("%-4d %-20s %-10d %-8s %-15s\n",
                        (i + 1), b.getNama(), b.getStok(), b.getSatuan(), b.getKadaluarsa());
            }
        }
    }

    // UPDATE
    public void updateBahan() {
        tampilInventaris();
        if (inventaris.isEmpty()) return;

        int index = validasiAngka("Masukkan nomor bahan yang ingin diupdate: ");

        if (index > 0 && index <= inventaris.size()) {
            Bahan b = inventaris.get(index - 1);

            System.out.print("Nama Bahan baru          : ");
            b.setNama(input.nextLine());
            b.setStok(validasiAngka("Jumlah Stok baru         : "));
            System.out.print("Satuan baru (kg/liter/pcs): ");
            b.setSatuan(input.nextLine());
            System.out.print("Tanggal Kadaluarsa baru  : ");
            b.setKadaluarsa(input.nextLine());

            System.out.println("Bahan berhasil diperbarui!");
        } else {
            System.out.println("Nomor bahan tidak valid.");
        }
    }

    // SEARCH
    public void cariBahan() {
        System.out.print("Masukkan nama bahan yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Bahan b : inventaris) {
            if (b.getNama().toLowerCase().contains(keyword)) {
                System.out.println("Ditemukan: " + b.getNama() +
                        " | Stok: " + b.getStok() + " " + b.getSatuan() +
                        " | Kadaluarsa: " + b.getKadaluarsa());
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Bahan tidak ditemukan.");
        }
    }

    // DELETE
    public void hapusBahan() {
        tampilInventaris();
        if (inventaris.isEmpty()) return;

        int index = validasiAngka("Masukkan nomor bahan yang ingin dihapus: ");

        if (index > 0 && index <= inventaris.size()) {
            inventaris.remove(index - 1);
            System.out.println("Bahan berhasil dihapus!");
        } else {
            System.out.println("Nomor bahan tidak valid.");
        }
    }

    // Validasi input angka (loop sampai benar)
    private int validasiAngka(String pesan) {
        int angka;
        while (true) {
            try {
                System.out.print(pesan);
                angka = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
        return angka;
    }
}
