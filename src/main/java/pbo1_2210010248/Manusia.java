package pbo1_2210010248;

// Contoh Enkapsulasi
public class Manusia {
    private String nama;
    private int umur;

    // Constructor
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode untuk mengakses data (getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Metode untuk memperbarui data (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Metode lain
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
