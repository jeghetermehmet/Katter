
public class Hovedprogram {
    public static void main(String[] args) {
        SortertArraylist<Katt> katter = new SortertArraylist<>();
        katter.settInn(new Katt("a", 5));
        katter.settInn(new Katt("b", 3));
        katter.settInn(new Katt("c", 1));
        katter.settInn(new Katt("d", 10));
        for (int i = 0; i < 4; i++) {
            System.out.println(katter.hentFoerste());
        }
    }
    }
    

