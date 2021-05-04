import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer(123456, "berkay", "Toslak", "1997", "123");
        Games games = new Games(1, 199, "PES2021", "Sport");
        Games mbwb = new Games(2, 100, "Warband", "War");
        Campaing campaing = new Campaing(1,"Bahar İndirimi",50);

        while (true) {
            System.out.println("===============Sistem Girişi===============");
            System.out.println("Giriş Yapmak için 1'e Basınız...");
            System.out.println("Kayıt için 2'ye Basınız...");
            System.out.println("Çıkış için 0'a Basınız...");
            System.out.println("==============================");
            System.out.print("Secim: ");

            int giris = scanner.nextInt();

            switch (giris) {
                case 1: {
                    Login login = new Login();
                    login.firstLogin();
                    if (login.getName().equals(customer.getName()) && login.getPassword().equals(customer.getPassword())) {
                        CustomerManager customerManager = new CustomerManager();
                        System.out.println("===============Hesap Ayarları===============");
                        customerManager.delete(customer);
                        customerManager.update(customer);
                        System.out.println("==========Oyunlarım==========");
                        GameManager gameManager = new GameManager();
                        gameManager.add(games);
                        gameManager.delete(games,customer);
                        gameManager.update(games,customer);
                        System.out.println("==========Yeni Kampanyalar==========");
                        CampaingManager campaingManager = new CampaingManager();
                        campaingManager.add(campaing);
                        campaingManager.update(campaing);
                        campaingManager.delete(campaing);
                        System.out.println("==========Oyun Satın Al==========");
                        gameManager.add(mbwb);
                        System.out.println("Fiyat: " + mbwb.getPrice()+"TL");
                        System.out.println("İndirimli Fiyat: "+campaingManager.newPrice(mbwb,campaing)+" TL");
                        System.exit(giris);


                    } else {
                        System.out.println("Şifre veya İD hatalı");
                    }
                    break;
                }


                case 2: {

                    CustomerManager customerManager = new CustomerManager();
                    customerManager.add(customer);
                    break;

                }
                case 0: {
                    System.out.println("Çıkış Yapılıyor...");
                    System.exit(giris);
                    break;
                }
            }
        }

    }
}
