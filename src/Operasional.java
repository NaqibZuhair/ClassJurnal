public class Operasional {
    int idTransaksi;
    String Tanggal;
    int BiayaMobil;
    int BiayaSupir;
    int TotalBiaya;

    public Operasional(int idTransaksi, String Tanggal, int BiayaMobil, int BiayaSupir) {
        this.idTransaksi = idTransaksi;
        this.Tanggal = Tanggal;
        this.BiayaMobil = BiayaMobil;
        this.BiayaSupir = BiayaSupir;
        this.TotalBiaya = BiayaMobil + BiayaSupir;
    }

    public void TambahData() {
        System.out.println("Data berhasil ditambahkan");
    }

    public void EditData(){
        System.out.println("Data berhasil diubah");
    }

    public void HapusData() {
        System.out.println("Data berhasil dihapus");
    }

    public void CariData() {
        System.out.println("Data ditemukan");
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }
    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
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
        System.out.println("IdTransaksi : " + idTransaksi);
        System.out.println("Tanggal     : " + Tanggal);
        System.out.println("BiayaMobil  : " + BiayaMobil);
        System.out.println("BiayaSupir  : " + BiayaSupir);
        System.out.println("TotalBiaya  : Rp" + TotalBiaya);
    }
}