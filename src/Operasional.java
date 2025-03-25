import java.util.Scanner;
import java.util.ArrayList;

public class Operasional {
    String idOperasional;
    String Tanggal;
    int BiayaMobil;
    int BiayaSupir;
    int TotalBiaya;

    private static ArrayList<Operasional> dataOperasional = new ArrayList<>();

    public Operasional(String idTransaksi, String Tanggal, int BiayaMobil, int BiayaSupir) {
        this.idOperasional = idTransaksi;
        this.Tanggal = Tanggal;
        this.BiayaMobil = BiayaMobil;
        this.BiayaSupir = BiayaSupir;
        this.TotalBiaya = BiayaMobil + BiayaSupir;
    }

    public static void CreateOperasional(Operasional operasional) {
        dataOperasional.add(operasional);
    }

    public static void ReadOperasional() {
        if (dataOperasional.isEmpty()) {
            System.out.println("Data Operasional tidak ditemukan");
        } else {
            for (Operasional operasional : dataOperasional) {
                operasional.info();
            }
        }
    }

    public static void UpdateOperasional(String idOperasional) {
        for (Operasional operasional : dataOperasional) {
            if (operasional.getIdOperasional().equals(idOperasional)) {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan ID Operasional baru: ");
                operasional.setIdOperasional(input.nextLine());

                System.out.print("Masukkan Tanggal baru: ");
                operasional.setTanggal(input.nextLine());

                System.out.print("Masukkan Biaya Mobil baru: ");
                operasional.setBiayaMobil(input.nextInt());
                input.nextLine();

                System.out.print("Masukkan Biaya Supir baru: ");
                operasional.setBiayaSupir(input.nextInt());
                input.nextLine();

                System.out.print("Operasioanal berhasi diubah");
                return;
            }
        }
        System.out.println("Data Operasional tidak ditemukan");
    }

    public static void DeleteOperasional(String idOperasional) {
        for (Operasional operasional : dataOperasional) {
            if (operasional.getIdOperasional().equals(idOperasional)) {
                dataOperasional.remove(operasional);
                System.out.println("Data Operasional berhasil dihapus");
            }
        }
    }

    public String getIdOperasional() {
        return idOperasional;
    }
    public void setIdOperasional(String idTransaksi) {
        this.idOperasional = idTransaksi;
    }
    public String getTanggal() {
        return Tanggal;
    }
    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    public int getBiayaMobil() {
        return BiayaMobil;
    }
    public void setBiayaMobil(int BiayaMobil) {
        this.BiayaMobil = BiayaMobil;
    }
    public int getBiayaSupir() {
        return BiayaSupir;
    }
    public void setBiayaSupir(int BiayaSupir) {
        this.BiayaSupir = BiayaSupir;
    }
    public int getTotalBiaya() {
        return TotalBiaya;
    }
    public void setTotalBiaya(int TotalBiaya) {
        this.TotalBiaya = TotalBiaya;
    }

    public void info() {
        System.out.println("Data Operasional");
        System.out.println("IdTransaksi : " + idOperasional);
        System.out.println("Tanggal     : " + Tanggal);
        System.out.println("BiayaMobil  : " + BiayaMobil);
        System.out.println("BiayaSupir  : " + BiayaSupir);
        System.out.println("TotalBiaya  : Rp" + TotalBiaya);
    }
}