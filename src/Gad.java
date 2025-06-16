public class Gad extends Zwierze {
    private boolean jadowity;

    public Gad(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "Syssss!";
    }

    @Override
    public String poruszajSie() {
        return "pełza po ziemi";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "pustynie, dżungle";
    }

    public boolean isJadowity() {
        return jadowity;
    }

    public void pokazCzyJadowity() {
        System.out.println("Czy jadowity: " + (jadowity ? "Tak" : "Nie"));
    }
}