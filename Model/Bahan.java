package Model;

public class Bahan {
    private String nama;
    private int stok;
    private String satuan;
    private String kadaluarsa;

    // Constructor
    public Bahan(String nama, int stok, String satuan, String kadaluarsa) {
        this.nama = nama;
        this.stok = stok;
        this.satuan = satuan;
        this.kadaluarsa = kadaluarsa;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(String kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
}
