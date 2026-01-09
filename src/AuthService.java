import java.util.List;

public class AuthService {

    private static final String KULLANICI_DOSYA = "kullanicilar.txt";

    public static Kullanici giris(String ad, String sifre) {
        List<Kullanici> users = DosyaService.kullanicilariOku(KULLANICI_DOSYA);

        for (Kullanici k : users) {
            if (k.getKullaniciAdi().equals(ad) && k.getSifre().equals(sifre)) {
                return k;
            }
        }
        return null;
    }
}
