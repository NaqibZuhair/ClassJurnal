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
        Barang.CreateBarang(barang1);
        Barang.CreateBarang(barang2);
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
        Transaksi transaksi1 = new Transaksi("101", "2025-03-10", "Riyan Shohibul", "Kayu Meranti", 5, "Lunas");
        Transaksi transaksi2 = new Transaksi("102", "2025-03-12", "Reza Arifin", "Kayu Jati", 7, "Belum Lunas");
        Transaksi.CreateTransaksi(transaksi1);
        Transaksi.CreateTransaksi(transaksi2);
        transaksi1.info();
        transaksi2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
                System.out.println("1. Create (Tambah data Transaksi)");
                System.out.println("2. Read (Tampilkan data Transaksi)");
                System.out.println("3. Update (Ubah data Transaksi)");
                System.out.println("4. Delete (Hapus data Transaksi)");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                input.nextLine();
                switch (pilihan) {
                    case 1:
                        System.out.println("\n===Tambah Data Transaksi===");
                        System.out.print("Masukkan ID Transaksi: ");
                        String idTransaksi = input.nextLine();
                        System.out.print("Masukkan Tanggal Transaksi: ");
                        String tanggalTransaksi = input.nextLine();
                        System.out.print("Masukkan Nama Pelanggan: ");
                        String namaPelanggan = input.nextLine();
                        System.out.print("Masukkan Jenis barang: ");
                        String jenisbarangT = input.nextLine();
                        System.out.print("Masukkan Jumlah: ");
                        int jumlahTransaksi = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan status Bayar: ");
                        String statusBayar = input.nextLine();

                        Transaksi transaksiBaru = new Transaksi(idTransaksi, tanggalTransaksi, namaPelanggan, jenisbarangT, jumlahTransaksi, statusBayar);
                        Transaksi.CreateTransaksi(transaksiBaru);
                        break;
                    case 2:
                        Transaksi.ReadTransaksi();
                        break;
                    case 3:
                        System.out.println("\n===Update Data Transaksi===");
                        System.out.print("Masukkan ID Transaksi yang ingin diubah: ");
                        String idUpdate = input.nextLine();
                        Transaksi.UpdateTransaksi(idUpdate);
                        break;
                    case 4:
                        System.out.println("\n===Hapus Data Transaksi===");
                        System.out.print("Masukkan ID Transaksi yang ingin dihapus: ");
                        String idHapus = input.nextLine();
                        Transaksi.DeleteTransaksi(idHapus);
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
        Laporan laporan1 = new Laporan("701", "Jl. Raya Hutan No. 5", "Laporan Penjualan Kayu Meranti", "2025-03-10");
        Laporan laporan2 = new Laporan("702", "Jl. Hutan Sejahtera No. 12", "Laporan Penebangan Kayu Jati", "2025-03-12");
        Laporan.CreateLaporan(laporan1);
        Laporan.CreateLaporan(laporan2);
        laporan1.info();
        laporan2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
                System.out.println("1. Create (Tambah data Laporan)");
                System.out.println("2. Read (Tampilkan data Laporan)");
                System.out.println("3. Update (Ubah data laporan)");
                System.out.println("4. Delete (Hapus data laporan)");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                input.nextLine();
                switch (pilihan) {
                    case 1:
                        System.out.println("\n===Tambah Data laporan===");
                        System.out.print("Masukkan ID Laporan: ");
                        String idLaporan = input.nextLine();
                        System.out.print("Masukkan Alamat Kirim: ");
                        String alamatKirim = input.nextLine();
                        System.out.print("Masukkan Deskripsi: ");
                        String Deskripsi = input.nextLine();
                        System.out.print("Masukkan Tanggal Laporan: ");
                        String tanggalLaporan = input.nextLine();

                        Laporan laporanBaru = new Laporan(idLaporan, alamatKirim, Deskripsi, tanggalLaporan);
                        Laporan.CreateLaporan(laporanBaru);
                        break;
                    case 2:
                        Laporan.ReadLaporan();
                        break;
                    case 3:
                        System.out.println("\n===Update Data Laporan===");
                        System.out.print("Masukkan ID Laporan yang ingin diubah: ");
                        String idUpdate = input.nextLine();
                        Laporan.UpdateLaporan(idUpdate);
                        break;
                    case 4:
                        System.out.println("\n===Hapus Data Laporan===");
                        System.out.print("Masukkan ID Laporan yang ingin dihapus: ");
                        String idHapus = input.nextLine();
                        Laporan.DeleteLaporan(idHapus);
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
        Operasional operasional1 = new Operasional("401", "2025-03-10", 250000, 80000);
        Operasional operasional2 = new Operasional("402", "2025-03-12", 300000, 90000);
        Operasional.CreateOperasional(operasional1);
        Operasional.CreateOperasional(operasional2);
        operasional1.info();
        operasional2.info();

        do {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;

            while (pilihan !=5) {
                System.out.println("\n");
                System.out.println("1. Create (Tambah data Operasional)");
                System.out.println("2. Read (Tampilkan data Operasional)");
                System.out.println("3. Update (Ubah data Operasional)");
                System.out.println("4. Delete (Hapus data Operasional)");
                System.out.println("5. Kembali");
                pilihan = input.nextInt();
                input.nextLine();
                switch (pilihan) {
                    case 1:
                        System.out.println("\n===Tambah Data Operasional===");
                        System.out.print("Masukkan ID Operasional: ");
                        String idOperasional = input.nextLine();
                        System.out.print("Masukkan Tanggal Operasional: ");
                        String tanggalOperasional = input.nextLine();
                        System.out.print("Masukkan Biaya Mobil: ");
                        int biayaMobil = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan Biaya Supir: ");
                        int biayaSupir = input.nextInt();
                        input.nextLine();

                        Operasional operasionalBaru = new Operasional(idOperasional, tanggalOperasional, biayaMobil, biayaSupir);
                        Operasional.CreateOperasional(operasionalBaru);
                        break;
                    case 3:
                        System.out.println("\n===Update Data Laporan===");
                        System.out.print("Masukkan ID Laporan yang ingin diubah: ");
                        String idUpdate = input.nextLine();
                        Laporan.UpdateLaporan(idUpdate);
                        break;
                    case 2:Operasional.ReadOperasional();
                        break;
                    case 4:
                        System.out.println("\n===Hapus Data Operasional===");
                        System.out.print("Masukkan ID Operasional yang ingin dihapus: ");
                        String idHapus = input.nextLine();
                        Operasional.DeleteOperasional(idHapus);
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
