import java.util.Scanner;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public boolean CobaLogin() {
        System.out.println("Menu Login, Silahkan Login Terlebih dahulu!");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan Password : ");
        String inputPassword = input.nextLine();
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}