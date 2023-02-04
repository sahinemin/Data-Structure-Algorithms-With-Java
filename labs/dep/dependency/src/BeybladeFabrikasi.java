
public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu) {

        return switch (beyblade_turu) {
            case "Dragon" -> new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
            case "Dranza" -> new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
            case "Drayga" -> new Dranza("Rei", 800, 250, "Beyaz Kaplan");
            case "Draciel" -> new Dranza("Max", 400, 1000, "Kara Kaplumbağa");
            default -> null;
        };
        
    }
}
