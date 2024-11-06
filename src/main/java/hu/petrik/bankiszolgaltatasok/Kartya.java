package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas {
    private String kartyaSzam;
    private Szamla szamla;

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg) {
        if (szamla.kivesz(osszeg)) {
            return true;
        }
        return false;
    }

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.kartyaSzam = kartyaSzam;
        this.szamla = szamla;
    }
}
