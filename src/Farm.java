import java.util.ArrayList;
import java.util.List;

public class Farm {

    private double penize;
    private double plocha;
    private List<Flower> rostliny;
    private List<Animal> zvirata;

    public Farm(double penize, double plocha) {
        this.penize = penize;
        this.plocha = plocha;
        this.rostliny = new ArrayList<>();
        this.zvirata = new ArrayList<>();
    }

    public void pridatRostlinu(Flower rostlina) {
        if (this.rostliny.size() < 5 && this.plocha >= rostlina.neededArea) {
            this.rostliny.add(rostlina);
            this.plocha -= rostlina.neededArea;
        } else {
            System.out.println("Nelze přidat rostlinu, nedostatek místa nebo dosažen limit druhů.");
        }
    }
    public void pridatZvire(Animal zvire) {
        if (this.zvirata.size() < 20) {
            this.zvirata.add(zvire);
        } else {
            System.out.println("Nelze přidat zvíře, dosažen limit.");
        }
    }

    public void odebratZvire(Animal zvire) {
        if (this.zvirata.contains(zvire)) {
            this.zvirata.remove(zvire);
        } else {
            System.out.println("Zvíře nenalezeno na farmě.");
        }
    }

}
