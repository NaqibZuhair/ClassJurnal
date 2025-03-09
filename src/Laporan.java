public class Laporan {
    int idLaporan;
    String AlamatKirim;
    String Deskripsi;
    String Tanggal;

    public Laporan(int Laporan, String AlamatKirim, String Deskripsi, String Tanggal) {
        this.idLaporan = Laporan;
        this.AlamatKirim = AlamatKirim;
        this.Deskripsi = Deskripsi;
        this.Tanggal = Tanggal;
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

    public int getIdLaporan() {
        return idLaporan;
    }
    public void setIdLaporan(int idLaporan) {
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