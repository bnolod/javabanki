package hu.petrik.bankiszolgaltatasok;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Szamla> szamlaList = new ArrayList<>();

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelkeret) {
        if (hitelkeret > 0) {
            szamlaList.add(new HitelSzamla(tulajdonos, hitelkeret));
        } else if (hitelkeret == 0) {
            szamlaList.add(new MegtakaritasiSzamla(tulajdonos));
        } else {
            throw new IllegalArgumentException("Hitelkeret nem lehet negatív");
        }
        return szamlaList.get(szamlaList.size() - 1);
    }

    public int getOsszEgyenleg(Tulajdonos tulajdonos) {
        int osszeg = 0;
        for (Szamla szamla : szamlaList) {
            if (szamla.getTulajdonos().equals(tulajdonos)) {
                osszeg += szamla.getAktualisEgyenleg();
            }
        }
        return osszeg;
    }
    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        Szamla legnagyobbEgyenleguSzamla = null;
        int maxEgyenleg = 0;
        for (Szamla szamla : szamlaList) {
            if (szamla.getTulajdonos().equals(tulajdonos)) {
                if (szamla.getAktualisEgyenleg() > maxEgyenleg) {
                    maxEgyenleg = szamla.getAktualisEgyenleg();
                    legnagyobbEgyenleguSzamla = szamla;
                }
            }
        }
        return legnagyobbEgyenleguSzamla;
    }

    public int getOsszHitelkeret() {
        int osszeg = 0;
        for (Szamla szamla : szamlaList) {
            if (szamla instanceof HitelSzamla) {
                osszeg += ((HitelSzamla)szamla).getHitelKeret();
            }
        }
        return osszeg;
    }


}
