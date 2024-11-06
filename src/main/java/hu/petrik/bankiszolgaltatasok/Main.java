package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Tulajdonos tulajdonos1 = new Tulajdonos("Kiss Pista");
        Tulajdonos tulajdonos2 = new Tulajdonos("Nagy József");

        Szamla szamla1 = bank.szamlaNyitas(tulajdonos1, 0);
        Szamla szamla2 = bank.szamlaNyitas(tulajdonos1, 1000);

        Szamla szamla3 = bank.szamlaNyitas(tulajdonos2, 0);
        Szamla szamla4 = bank.szamlaNyitas(tulajdonos2, 1000);

        szamla1.befizet(1000);
        szamla2.befizet(2000);
        szamla3.befizet(3000);
        szamla4.befizet(4000);

        System.out.println(bank.getOsszEgyenleg(tulajdonos1));
        System.out.println(bank.getOsszEgyenleg(tulajdonos2));

        System.out.println(bank.getLegnagyobbEgyenleguSzamla(tulajdonos1).getAktualisEgyenleg());
        System.out.println(bank.getLegnagyobbEgyenleguSzamla(tulajdonos2).getAktualisEgyenleg());

        System.out.println(bank.getOsszHitelkeret());

        System.out.println(szamla1.kivesz(500));
        System.out.println(szamla1.kivesz(5000));

        System.out.println(szamla2.kivesz(500));
        System.out.println(szamla2.kivesz(5000));

        System.out.println(szamla3.kivesz(500));
        System.out.println(szamla3.kivesz(5000));

        System.out.println(szamla4.kivesz(500));
        System.out.println(szamla4.kivesz(5000));



    }
}
