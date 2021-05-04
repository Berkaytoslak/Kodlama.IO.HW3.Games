import java.util.Scanner;

public class CustomerManager implements CustomerServices{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add(Customer customer) {
        System.out.print("İsim giriniz: ");
        customer.setName(scanner.nextLine());
        System.out.print("Soyisim giriniz: ");
        customer.setLastName(scanner.nextLine());
        System.out.print("Birthdate giriniz: ");
        customer.setBirthDate(scanner.nextLine());
        System.out.print("Password giriniz: ");
        customer.setPassword(scanner.nextLine());
        System.out.print("TC: ");
        customer.setTcNo(scanner.nextInt());
        System.out.println("==Kayıt Tamamlandı==");
        System.out.println("Kullanıcı Eklendi: " + customer.getName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Hesap Silindi: " + customer.getName());


    }

    @Override
    public void update(Customer customer) {
        System.out.println("Hesap düzenlendi: " + customer.getName());

    }

}
