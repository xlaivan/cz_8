public class Ssak extends Zwierze {
    private String futro;

    public Ssak(String nazwa, int wiek, String futro) {
        super(nazwa, wiek);
        this.futro = futro;
    }

    @Override
    public String wydajDzwiek() {
        return "Mrrrr!";
    }

    @Override
    public String poruszajSie() {
        return "chodzi na czterech łapach";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "lasy, łąki";
    }

    public String getFutro() {
        return futro;
    }

    public void pokazFutro() {
        System.out.println("Typ futra: " + futro);
    }
}