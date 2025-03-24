import java.util.ArrayList;
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
        Barang barang1 = new Barang("B01", "Kayu Meranti", "2025-03-10", 200, 50, 20);
        Barang barang2 = new Barang("B02", "Kayu Jati", "2025-03-12", 150, 40, 15);
        barang1.info();
        barang2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
                System.out.println("1. Create (Tambah data Barang)");
                System.out.println("2. Read (Tampilkan data Barang)");
                System.out.println("3. Update (Ubah data Barang)");
                System.out.println("4. Delete (Hapus data Barang)");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                input.nextLine();
                switch (pilihan) {
                    case 1:
                        System.out.println("\n===Tambah Data Barang===");
                        System.out.print("Masukkan ID Barang: ");
                        String idBarang = input.nextLine();
                        System.out.print("Masukkan Jenis Barang: ");
                        String jenisBarang = input.nextLine();
                        System.out.print("Masukkan Tanggal (dd-mm-yyyy): ");
                        String tanggal = input.nextLine();
                        System.out.print("Masukkan Stok Gudang: ");
                        int stokGudang = input.nextInt();
                        System.out.print("Masukkan Barang Masuk: ");
                        int barangMasuk = input.nextInt();
                        System.out.print("Masukkan Barang Keluar: ");
                        int barangKeluar = input.nextInt();
                        input.nextLine();

                        Barang barangBaru = new Barang(idBarang, jenisBarang, tanggal, stokGudang, barangMasuk, barangKeluar);
                        Barang.CreateBarang(barangBaru);
                        break;
                    case 2:
                        Barang.ReadBarang();
                        break;
                    case 3:
                        System.out.println("\n===Update Data Barang===");
                        System.out.print("Masukkan ID Barang yang ingin diubah: ");
                        String idUpdate = input.nextLine();
                        Barang.UpdateBarang(idUpdate);
                        break;
                    case 4:
                        System.out.println("\n===Hapus Data Barang===");
                        System.out.print("Masukkan ID Barang yang ingin dihapus: ");
                        String idHapus = input.nextLine();
                        Barang.DeleteBarang(idHapus);
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
        Transaksi transaksi1 = new Transaksi(101, "2025-03-10", "Riyan Shohibul", "Kayu Meranti", 5, "Lunas");
        Transaksi transaksi2 = new Transaksi(102, "2025-03-12", "Reza Arifin", "Kayu Jati", 7, "Belum Lunas");
        transaksi1.info();
        transaksi2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
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
        Laporan laporan1 = new Laporan(701, "Jl. Raya Hutan No. 5", "Laporan Penjualan Kayu Meranti", "2025-03-10");
        Laporan laporan2 = new Laporan(702, "Jl. Hutan Sejahtera No. 12", "Laporan Penebangan Kayu Jati", "2025-03-12");

        laporan1.info();
        laporan2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
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
        Operasional operasional1 = new Operasional(401, "2025-03-10", 250000, 80000);
        Operasional operasional2 = new Operasional(402, "2025-03-12", 300000, 90000);
        operasional1.info();
        operasional2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
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
