import java.util.Scanner;
import java.util.ArrayList;

public class Laporan {
    String idLaporan;
    String AlamatKirim;
    String Deskripsi;
    String Tanggal;

    private static ArrayList<Laporan> daftarLaporan = new ArrayList<>();

    public Laporan(String idlaporan, String AlamatKirim, String Deskripsi, String Tanggal) {
        this.idLaporan = idlaporan;
        this.AlamatKirim = AlamatKirim;
        this.Deskripsi = Deskripsi;
        this.Tanggal = Tanggal;
    }

    public static void CreateLaporan(Laporan laporan) {
        daftarLaporan.add(laporan);
    }

    public static void ReadLaporan() {
        if (daftarLaporan.isEmpty()) {
            System.out.println("Laporan tidak ditemukan");
        } else {
            for (Laporan laporan : daftarLaporan) {
                laporan.info();
            }
        }
    }

    public static void UpdateLaporan(String idLaporan) {
        for (Laporan laporan : daftarLaporan) {
            if (laporan.getIdLaporan().equals(idLaporan)) {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan idLaporan Baru : ");
                laporan.setIdLaporan(input.nextLine());

                System.out.println("Masukkan AlamatKirim baru: ");
                laporan.setAlamatKirim(input.nextLine());

                System.out.println("Masukkan Deskripsi baru : ");
                laporan.setDeskripsi(input.nextLine());

                System.out.println("Masukkan Tanggal (dd-mm-yyyy) baru: ");
                laporan.setTanggal(input.nextLine());

                System.out.println("Laporan berhasil diubah");
                return;
            }
        }
        System.out.println("Laporan tidak ditemukan");
    }

    public static void DeleteLaporan(String idLaporan) {
        for (Laporan laporan : daftarLaporan) {
            if (laporan.getIdLaporan().equals(idLaporan)) {
                daftarLaporan.remove(laporan);
                System.out.println("Laporan berhasil dihapus");
            }
        }
    }

    public void TambahData() {
        System.out.println("Laporan berhasil ditambahkan");
    }

    public void EditData(){
        System.out.println("Laporan berhasil diubah");
    }

    public void HapusData() {
        System.out.println("Laporan berhasil dihapus");
    }

    public void CariData() {
        System.out.println("Laporan ditemukan");
    }

    public String getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(String idLaporan) {
        this.idLaporan = idLaporan;
    }
    public String getAlamatKirim() {
        return AlamatKirim;
    }
    public void setAlamatKirim(String AlamatKirim) {
        this.AlamatKirim = AlamatKirim;
    }
    public String getDeskripsi() {
        return Deskripsi;
    }
    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }
    public String getTanggal() {
        return Tanggal;
    }
    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void info() {
        System.out.println("Data Laporan");
        System.out.println("Laporan Id   : " + this.idLaporan);
        System.out.println("Alamat Kirim : " + this.AlamatKirim);
        System.out.println("Deskripsi    : " + this.Deskripsi);
        System.out.println("Tanggal      : " + this.Tanggal);
        System.out.println();
    }
}