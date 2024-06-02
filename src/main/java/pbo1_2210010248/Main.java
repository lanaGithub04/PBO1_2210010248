package pbo1_2210010248;

// Contoh Polimorfisme
public class Main {
    public static void main(String[] args) {
        // Objek Manusia
        Manusia manusia = new Manusia("Alice", 30);
        Manusia manusia = new Manusia ();
        manusia.info();
        System.out.println();

        // Objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("John", 20, "Informatika");
        mahasiswa.info();
    }
}
