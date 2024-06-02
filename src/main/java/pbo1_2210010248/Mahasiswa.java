package pbo1_2210010248;

// Contoh Pewarisan (Inheritance)
public class Mahasiswa extends Manusia {
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, int umur, String jurusan) {
        super(nama, umur);
        this.jurusan = jurusan;
    }

    // Metode untuk mengakses data (getter)
    public String getJurusan() {
        return jurusan;
    }

    // Metode lain
    @Override
    public void info() {
        super.info(); // Memanggil metode info() dari kelas induk
        System.out.println("Jurusan: " + jurusan);
    }
}
