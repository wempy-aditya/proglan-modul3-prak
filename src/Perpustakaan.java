import java.util.ArrayList;
import java.util.List;

/**
 * Kelas perpustakaan untuk mengelolah perpustakaan dan mengelolah buku
 * */
public class Perpustakaan {
    private List<String> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    /**
     * Method untuk menambahkan buku
     * @param judul parameter judul untuk menambahkan buku kedalam fungsi yambahbuku()
     * */
    public void tambahBuku(String judul) {
        daftarBuku.add(judul);
    }

    public void hapusBuku(String judul) {
        daftarBuku.remove(judul);
    }

    /**
     * @return daf
     * */
    public List<String> getDaftarBuku() {
        return daftarBuku;
    }

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku("Harry Potter");
        perpustakaan.tambahBuku("Lord of the Rings");

        List<String> daftarBuku = perpustakaan.getDaftarBuku();
        System.out.println("Daftar Buku di Perpustakaan:");
        for (String buku : daftarBuku) {
            System.out.println(buku);
        }
    }
}