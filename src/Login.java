import java.util.Scanner;

public class Login {
    private String Name;
    private String password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void firstLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        setName(scanner.nextLine());
        System.out.print("Şifre: ");
        setPassword(scanner.nextLine());
    }


}
