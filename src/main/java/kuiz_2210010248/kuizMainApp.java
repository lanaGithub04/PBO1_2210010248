package kuiz_2210010248;

// Import kelas Kuiz
import kuiz_2210010248.kuiz;

// Nama file: kuizMainApp.java
public class kuizMainApp {
    public static void main(String[] args) {
        // Membuat objek Kuiz dengan parameter
        kuiz kuiz1 = new kuiz("Matematika Dasar", 10, true);
        
        // Membuat objek Kuiz tanpa parameter
        kuiz kuiz2 = new kuiz();
        
        // Membuat objek Kuiz dengan konstruktor baru
        kuiz kuiz3 = new kuiz("Sejarah", 5, false);

        // Menampilkan informasi tentang kuiz pertama
        kuiz1.displayInfo();
        
        // Menampilkan informasi tentang kuiz kedua
        kuiz2.displayInfo();
        
        // Menampilkan informasi tentang kuiz ketiga
        kuiz3.displayInfo();

        // Menggunakan metode accessor untuk mengakses atribut kuiz pertama
        System.out.println("Mengakses atribut menggunakan metode accessor untuk kuiz pertama:");
        System.out.println("Judul Kuiz: " + kuiz1.getJudul());
        System.out.println("Jumlah Soal: " + kuiz1.getJumlahSoal());
        System.out.println("Status Aktif: " + (kuiz1.isActive() ? "Aktif" : "Tidak Aktif"));
        
        // Menggunakan metode accessor untuk mengakses atribut kuiz kedua
        System.out.println("Mengakses atribut menggunakan metode accessor untuk kuiz kedua:");
        System.out.println("Judul Kuiz: " + kuiz2.getJudul());
        System.out.println("Jumlah Soal: " + kuiz2.getJumlahSoal());
        System.out.println("Status Aktif: " + (kuiz2.isActive() ? "Aktif" : "Tidak Aktif"));

        // Menggunakan metode accessor untuk mengakses atribut kuiz ketiga
        System.out.println("Mengakses atribut menggunakan metode accessor untuk kuiz ketiga:");
        System.out.println("Judul Kuiz: " + kuiz3.getJudul());
        System.out.println("Jumlah Soal: " + kuiz3.getJumlahSoal());
        System.out.println("Status Aktif: " + (kuiz3.isActive() ? "Aktif" : "Tidak Aktif"));

        // Menggunakan metode mutator untuk mengubah judul kuiz pertama
        System.out.println("\nMengubah judul kuiz pertama...");
        kuiz1.updateJudul("Fisika Dasar");
        
        // Menampilkan informasi yang diperbarui tentang kuiz pertama
        kuiz1.displayInfo();
    }
}
