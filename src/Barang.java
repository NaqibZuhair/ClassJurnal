import java.util.Scanner;
import java.util.ArrayList;

public class Barang {
    private String idBarang;
    private String JenisBarang;
    private String Tanggal;
    private int StokGudang;
    private int BarangMasuk;
    private int BarangKeluar;

    private static ArrayList<Barang> daftarBarang = new ArrayList<>();

    public Barang(String idBarang, String JenisBarang, String Tanggal, int StokGudang, int BarangMasuk, int BarangKeluar) {
        this.idBarang = idBarang;
        this.JenisBarang = JenisBarang;
        this.Tanggal = Tanggal;
        this.StokGudang = StokGudang;
        this.BarangMasuk = BarangMasuk;
        this.BarangKeluar = BarangKeluar;
    }

    public static void CreateBarang(Barang barang) {
        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan");
    }

    public static void ReadBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada data barang yang tersimpan");
        } else {
            for (Barang barang : daftarBarang) {
                barang.info();
            }
        }
    }

    public static void UpdateBarang(String idBarang) {
        for (Barang barang : daftarBarang) {
            if (barang.getIdBarang().equals(idBarang)) {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan jenis barang baru :");
                barang.JenisBarang = input.nextLine();

                System.out.print("Masukkan tanggal barang baru :");
                barang.Tanggal = input.nextLine();

                System.out.print("Masukkan stok gudang baru :");
                barang.StokGudang = input.nextInt();

                System.out.print("Masukkan barang masuk baru :");
                barang.BarangMasuk = input.nextInt();

                System.out.print("Masukkan barang keluar baru :");
                barang.BarangKeluar = input.nextInt();

                System.out.println("Barang berhasil diubah");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan");
    }

    public static void DeleteBarang(String idBarang) {
        for (Barang barang : daftarBarang) {
            if (barang.getIdBarang().equals(idBarang)) {
                daftarBarang.remove(barang);
                System.out.println("Barang berhasil dihapus");
            }
        }
        System.out.println("Barang tidak ditemukan");
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

    public int getStokGudang() {
        return StokGudang;
    }

    public void setStokGudang(int stokGudang) {
        StokGudang = stokGudang;
    }

    public int getBarangMasuk() {
        return BarangMasuk;
    }

    public void setBarangMasuk(int barangMasuk) {
        BarangMasuk = barangMasuk;
    }

    public int getBarangKeluar() {
        return BarangKeluar;
    }

    public void setBarangKeluar(int barangKeluar) {
        BarangKeluar = barangKeluar;
    }

    public void info() {
        System.out.println("Data Barang");
        System.out.println("Id Barang     : " + getIdBarang());
        System.out.println("Jenis Barang  : " + getJenisBarang());
        System.out.println("Tanggal       : " + getTanggal());
        System.out.println("Stok Guudang  : " + getStokGudang());
        System.out.println("Barang Masuk  : " + getBarangMasuk());
        System.out.println("Barang Keluar : " + getBarangKeluar());
        System.out.println();
    }
}