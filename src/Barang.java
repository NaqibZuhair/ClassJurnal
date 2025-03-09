public class Barang {
    private String idBarang;
    private String JenisBarang;
    private String Tanggal;
    private int StokGudang;
    private int BarangMasuk;
    private int BarangKeluar;

    public Barang(String idBarang, String JenisBarang, String Tanggal, int StokGudang, int BarangMasuk, int BarangKeluar) {
        this.idBarang = idBarang;
        this.JenisBarang = JenisBarang;
        this.Tanggal = Tanggal;
        this.StokGudang = StokGudang;
        this.BarangMasuk = BarangMasuk;
        this.BarangKeluar = BarangKeluar;
    }

    public void TambahData() {
        System.out.println("Barang berhasil ditambahkan");
    }

    public void EditData(){
        System.out.println("Barang berhasil diubah");
    }

    public void HapusData() {
        System.out.println("Barang berhasil dihapus");
    }

    public void CariData() {
        System.out.println("Barang ditemukan");
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
        System.out.println("Id Barang : " + getIdBarang());
        System.out.println("Jenis Barang  : " + getJenisBarang());
        System.out.println("Tanggal       : " + getTanggal());
        System.out.println("Stok Guudang  : " + getStokGudang());
        System.out.println("Barang Masuk  : " + getBarangMasuk());
        System.out.println("Barang Keluar : " + getBarangKeluar());
        System.out.println();
    }
}