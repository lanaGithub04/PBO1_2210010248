package kuiz_2210010248;

public class kuiz {
    private String judul;
    private int jumlahSoal;
    private boolean isActive;

    public kuiz(String judul, int jumlahSoal, boolean isActive) {
        this.judul = judul;
        this.jumlahSoal = jumlahSoal;
        this.isActive = isActive;
    }

    public kuiz() {
        this.judul = "Tanpa Judul";
        this.jumlahSoal = 0;
        this.isActive = false;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }

    public void setJumlahSoal(int jumlahSoal) {
        this.jumlahSoal = jumlahSoal;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void displayInfo() {
        System.out.println("Judul Kuiz: " + judul);
        System.out.println("Jumlah Soal: " + jumlahSoal);
        System.out.println("Status Aktif: " + (isActive ? "Aktif" : "Tidak Aktif"));
    }

    public void updateJudul(String newJudul) {
        this.judul = newJudul;
    }
}
