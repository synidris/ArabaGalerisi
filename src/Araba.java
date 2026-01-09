public class Araba {
    private int id;
    private String marka;
    private String model;
    private int yil;
    private double fiyat;

    public Araba(int id, String marka, String model, int yil, double fiyat) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public String toFile() {
        return id + "," + marka + "," + model + "," + yil + "," + fiyat;
    }

    public static Araba fromFile(String line) {
        String[] p = line.split(",");
        return new Araba(
                Integer.parseInt(p[0]),
                p[1],
                p[2],
                Integer.parseInt(p[3]),
                Double.parseDouble(p[4])
        );
    }

    @Override
    public String toString() {
        return id + " | " + marka + " | " + model + " | " + yil + " | " + fiyat + " TL";
    }
}
