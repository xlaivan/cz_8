public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = new Zwierze[3];

        zwierzeta[0] = new Ssak("Lew", 5, "krótkie, złote");
        zwierzeta[1] = new Ptak("Orzeł", 3, 2.1);
        zwierzeta[2] = new Gad("Wąż", 2, true);

        System.out.println("===== Informacje o zwierzętach =====");
        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("---------------------");
        }

        System.out.println("===== Metody specyficzne dla podklas =====");
        for (Zwierze z : zwierzeta) {
            if (z instanceof Ssak) {
                ((Ssak) z).pokazFutro();
            } else if (z instanceof Ptak) {
                ((Ptak) z).pokazRozpietosc();
            } else if (z instanceof Gad) {
                ((Gad) z).pokazCzyJadowity();
            }
            System.out.println();
        }
    }
}