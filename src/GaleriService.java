import java.util.List;

public class GaleriService {

    private static final String STOK = "stok.txt";
    private static final String SATILAN = "satilanlar.txt";

    public int yeniId() {
        int max = 0;
        for (Araba a : DosyaService.arabalarOku(STOK)) {
            if (a.getId() > max) max = a.getId();
        }
        return max + 1;
    }

    public void arabaEkle(Araba araba) {
        DosyaService.arabaEkle(STOK, araba);
    }

    public List<Araba> stokGetir() {
        return DosyaService.arabalarOku(STOK);
    }

    public void arabaSat(int id) {
        List<Araba> stok = stokGetir();
        Araba satilan = null;

        for (Araba a : stok) {
            if (a.getId() == id) {
                satilan = a;
                break;
            }
        }

        if (satilan != null) {
            stok.remove(satilan);
            DosyaService.arabalarYaz(STOK, stok);
            DosyaService.arabaEkle(SATILAN, satilan);
        }
    }

    public List<Araba> satilanlariGetir() {
        return DosyaService.arabalarOku(SATILAN);
    }
}
