import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        boolean berhasilLogin = false;

        do {
            berhasilLogin = dashboard.DashLogin();
            if (berhasilLogin) {
                Scanner input = new Scanner(System.in);
                int pilihan = 0;

                while (pilihan !=5) {
                    System.out.println("\nHallo Selamat Datang di Program Kami\n");
                    System.out.println("Pilih Menu");
                    System.out.println("1. Menu Barang");
                    System.out.println("2. Menu Transaksi");
                    System.out.println("3. Menu Laporan");
                    System.out.println("4. Menu Operasional");
                    System.out.println("5. Keluar");
                    System.out.println("Masukkan angka : ");
                    pilihan = input.nextInt();

                    switch (pilihan) {
                        case 1:
                            dashboard.DashBarang();
                            break;
                        case 2:
                            dashboard.DashTransaksi();
                            break;
                        case 3:
                            dashboard.DashLaporan();
                            break;
                        case 4:
                            dashboard.DashOperasional();
                            break;
                        case 5:
                            System.out.println("Keluar...");
                            return;
                        default:
                            System.out.println("Pilih tidak valid");
                    }
                }
            } else {
                System.out.println("Login gagal, Coba Lagi!");
            }
        } while (!berhasilLogin);
    }
}