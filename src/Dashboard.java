import java.util.Scanner;

public class Dashboard {

    public boolean DashLogin() {
        Login login = new Login("admin", "123");
        if (login.CobaLogin()) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal, Coba Lagi!\n");
            return false;
        }
    }

    public void DashBarang() {
        Barang barang1 = new Barang("Batok", "Batok", "22-02", 87, 23, 24);
        barang1.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("1. Tambah Data Barang");
                System.out.println("2. Edit Data Barang");
                System.out.println("3. Hapus Data Barang");
                System.out.println("4. Cari Data Barang");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        barang1.TambahData();
                        break;
                    case 2:
                        barang1.EditData();
                        break;
                    case 3:
                        barang1.HapusData();
                        break;
                    case 4:
                        barang1.CariData();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilih tidak valid");
                }
            }
        } while (true);
    }

    public void DashTransaksi() {
        Transaksi transaksi1 = new Transaksi(9402934, "24-12", "Reza Arifin", "Kayu Jati", 22, "Ngutang");
        transaksi1.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("1. Tambah Data Transaksi");
                System.out.println("2. Edit Data Transaksi");
                System.out.println("3. Hapus Data Transaksi");
                System.out.println("4. Cari Data Transaksi");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        transaksi1.TambahData();
                        break;
                    case 2:
                        transaksi1.EditData();
                        break;
                    case 3:
                        transaksi1.HapusData();
                        break;
                    case 4:
                        transaksi1.CariData();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilih tidak valid");
                }
            }
        } while (true);
    }

    public void DashLaporan() {
        Laporan laporan1 = new Laporan(812682, "Depok Baru", "Barang Rusak", "22-08");
        laporan1.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("1. Tambah Data Laporan");
                System.out.println("2. Edit Data Laporan");
                System.out.println("3. Hapus Data Laporan");
                System.out.println("4. Cari Data Laporan");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        laporan1.TambahData();
                        break;
                    case 2:
                        laporan1.EditData();
                        break;
                    case 3:
                        laporan1.HapusData();
                        break;
                    case 4:
                        laporan1.CariData();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilih tidak valid");
                }
            }
        } while (true);
    }

    public void DashOperasional() {
        Operasional operasional1 = new Operasional(937590, "17-08", 200000, 100000);
        operasional1.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("1. Tambah Data");
                System.out.println("2. Edit Data");
                System.out.println("3. Hapus Data");
                System.out.println("4. Cari Data");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        operasional1.TambahData();
                        break;
                    case 2:
                        operasional1.EditData();
                        break;
                    case 3:
                        operasional1.HapusData();
                        break;
                    case 4:
                        operasional1.CariData();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilih tidak valid");
                }
            }
        } while (true);
    }
}
