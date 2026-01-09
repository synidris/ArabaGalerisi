import java.io.*;
import java.util.*;

public class DosyaService {

    public static List<Araba> arabalarOku(String dosya) {
        List<Araba> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Araba.fromFile(line));
            }
        } catch (IOException e) {}

        return list;
    }

    public static void arabalarYaz(String dosya, List<Araba> arabalar) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosya))) {
            for (Araba a : arabalar) {
                bw.write(a.toFile());
                bw.newLine();
            }
        } catch (IOException e) {}
    }

    public static void arabaEkle(String dosya, Araba araba) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosya, true))) {
            bw.write(araba.toFile());
            bw.newLine();
        } catch (IOException e) {}
    }

    public static List<Kullanici> kullanicilariOku(String dosya) {
        List<Kullanici> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                list.add(new Kullanici(p[0], p[1], p[2]));
            }
        } catch (IOException e) {}

        return list;
    }
}
