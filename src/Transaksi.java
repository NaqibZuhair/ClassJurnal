public class Transaksi {
    private int idTransaksi;
    private String Tanggal;
    private String NamaPelanggan;
    private String JenisBarang;
    private int Jumlah;
    private String StatusBayar;

    public Transaksi(int idTransaksi, String Tanggal, String NamaPelanggan, String JenisBarang, int Jumlah, String StatusBayar) {
        this.idTransaksi = idTransaksi;
        this.Tanggal = Tanggal;
        this.NamaPelanggan = NamaPelanggan;
        this.JenisBarang = JenisBarang;
        this.Jumlah = Jumlah;
        this.StatusBayar = StatusBayar;
    }

    public void TambahData() {
        System.out.println("Transaksi berhasil ditambahkan");
    }

    public void EditData(){
        System.out.println("Transaksi berhasil diubah");
    }

    public void HapusData() {
        System.out.println("Transaksi berhasil dihapus");
    }

    public void CariData() {
        System.out.println("Transaksi ditemukan");
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