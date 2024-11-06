package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    static double alapKamat = 1.1;
    public double kamat;

    public double getKamat() {
        return kamat;
    }
    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }
    @Override
    public boolean kivesz(int osszeg) {
        if (osszeg <= getAktualisEgyenleg()) {
            setAktualisEgyenleg(getAktualisEgyenleg() - osszeg);
            return true;
        }
        return false;
    }

    public void kamatJovairas() {
        setAktualisEgyenleg((int)(getAktualisEgyenleg() * alapKamat));
    }
}
