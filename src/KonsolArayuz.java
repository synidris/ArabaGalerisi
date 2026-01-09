import java.util.Scanner;

public class KonsolArayuz {

    private Scanner sc = new Scanner(System.in);
    private GaleriService galeri = new GaleriService();

    public void baslat() {
        Kullanici aktif = login();
        if (aktif == null) {
            System.out.println("Hatalı giriş!");
            return;
        }
        menu(aktif);
    }

    private Kullanici login() {
        System.out.print("Kullanıcı Adı: ");
        String ad = sc.nextLine();
        System.out.print("Şifre: ");
        String sifre = sc.nextLine();
        return AuthService.giris(ad, sifre);
    }

    private void menu(Kullanici k) {
        while (true) {
            System.out.println("\n--- GALERİ SİSTEMİ (" + k.getRol() + ") ---");
            System.out.println("1- Araba Ekle");
            System.out.println("2- Stok Listele");
            System.out.println("3- Araba Sat");
            System.out.println("4- Satılanlar");
            System.out.println("0- Çıkış");

            int secim = Integer.parseInt(sc.nextLine());

            switch (secim) {
                case 1 -> arabaEkle();
                case 2 -> galeri.stokGetir().forEach(System.out::println);
                case 3 -> arabaSat();
                case 4 -> galeri.satilanlariGetir().forEach(System.out::println);
                case 0 -> { return; }
            }
        }
    }

    private void arabaEkle() {
        int id = galeri.yeniId();

        System.out.print("Marka: ");
        String marka = sc.nextLine();
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Yıl: ");
        int yil = Integer.parseInt(sc.nextLine());
        System.out.print("Fiyat: ");
        double fiyat = Double.parseDouble(sc.nextLine());

        galeri.arabaEkle(new Araba(id, marka, model, yil, fiyat));
        System.out.println("Araba eklendi.");
    }

    private void arabaSat() {
        System.out.print("Satılacak ID: ");
        int id = Integer.parseInt(sc.nextLine());
        galeri.arabaSat(id);
        System.out.println("Satış tamamlandı.");
    }
}
