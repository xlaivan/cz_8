public class Ptak extends Zwierze {
    private double rozpiętośćSkrzydeł;

    public Ptak(String nazwa, int wiek, double rozpiętośćSkrzydeł) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpiętośćSkrzydeł;
    }

    @Override
    public String wydajDzwiek() {
        return "Ćwir ćwir!";
    }

    @Override
    public String poruszajSie() {
        return "lata w powietrzu";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "lasy, góry";
    }

    public double getRozpietoscSkrzydel() {
        return rozpiętośćSkrzydeł;
    }

    public void pokazRozpietosc() {
        System.out.println("Rozpiętość skrzydeł: " + rozpiętośćSkrzydeł + " m");
    }
}