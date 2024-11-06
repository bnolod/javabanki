package hu.petrik.bankiszolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas {
    private Tulajdonos tulajdonos;
    private int aktualisEgyenleg;



    public Kartya ujKartya(String kartyaSzam) {
        return new Kartya(this.tulajdonos, this, kartyaSzam);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    //muszaj megcsinalnom sajnos
    public void setAktualisEgyenleg(int aktualisEgyenleg) {
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.tulajdonos = tulajdonos;
        this.aktualisEgyenleg = 0;
    }

    public void befizet(int osszeg) {
        if (osszeg > 0) {
            this.aktualisEgyenleg += osszeg;
        }
    }

    abstract boolean kivesz(int osszeg);
}
