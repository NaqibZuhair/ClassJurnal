import java.util.Scanner;
import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private String Tanggal;
    private String NamaPelanggan;
    private String JenisBarang;
    private int Jumlah;
    private String StatusBayar;

    private static ArrayList<Transaksi> dataTransaksi = new ArrayList<>();

    public Transaksi(String idTransaksi, String Tanggal, String NamaPelanggan, String JenisBarang, int Jumlah, String StatusBayar) {
        this.idTransaksi = idTransaksi;
        this.Tanggal = Tanggal;
        this.NamaPelanggan = NamaPelanggan;
        this.JenisBarang = JenisBarang;
        this.Jumlah = Jumlah;
        this.StatusBayar = StatusBayar;
    }

    public static void CreateTransaksi(Transaksi transaksi) {
        dataTransaksi.add(transaksi);
    }

    public static void ReadTransaksi() {
        if (dataTransaksi.isEmpty()) {
            System.out.println("Transaksi tidak ditemukan");
        } else {
            for (Transaksi transaksi : dataTransaksi) {
                transaksi.info();
            }
        }
    }

    public static void UpdateTransaksi(String idTransaksi) {
        for (Transaksi transaksi1 : dataTransaksi) {
            if (transaksi1.idTransaksi.equals(idTransaksi)) {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan Id Transaksi baru : ");
                transaksi1.setIdTransaksi(input.nextLine());

                System.out.print("Masukkan Tanggal baru : ");
                transaksi1.setTanggal(input.nextLine());

                System.out.print("Masukkan Nama Pelanggan baru : ");
                transaksi1.setNamaPelanggan(input.nextLine());

                System.out.print("Masukkan Jenis Barang baru : ");
                transaksi1.setJenisBarang(input.nextLine());

                System.out.print("Masukkan Jumlah Barang baru : ");
                transaksi1.setJumlah(input.nextInt());
                input.nextLine();

                System.out.print("Masukkan Status Bayar baru : ");
                transaksi1.setStatusBayar(input.nextLine());

                System.out.print("Data Transaksi berhasil diubah");
                return;
            }
        }
        System.out.println("Transaksi tidak ditemukan");
    }

    public static void DeleteTransaksi(String idTransaksi) {
        for (Transaksi transaksi1 : dataTransaksi) {
            if (transaksi1.idTransaksi.equals(idTransaksi)) {
                dataTransaksi.remove(transaksi1);
                System.out.println("Transaksi berhasil dihapus");
            }
        }
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    public String getTanggal() {
        return Tanggal;
    }
    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    public String getNamaPelanggan() {
        return NamaPelanggan;
    }
    public void setNamaPelanggan(String NamaPelanggan) {
        this.NamaPelanggan = NamaPelanggan;
    }
    public String getJenisBarang() {
        return JenisBarang;
    }
    public void setJenisBarang(String JenisBarang) {
        this.JenisBarang = JenisBarang;
    }
    public int getJumlah() {
        return Jumlah;
    }
    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }
    public String getStatusBayar() {
        return StatusBayar;
    }
    public void setStatusBayar(String StatusBayar) {
        this.StatusBayar = StatusBayar;
    }

    public void info() {
        System.out.println("Data Transaksi");
        System.out.println("IdTransaksi   : " + idTransaksi);
        System.out.println("Tanggal       : " + Tanggal);
        System.out.println("NamaPelanggan : " + NamaPelanggan);
        System.out.println("JenisBarang   : " + JenisBarang);
        System.out.println("Jumlah        : " + Jumlah);
        System.out.println("StatusBayar   : " + StatusBayar);
        System.out.println();
    }
}