package cz.czechitas.ukol07;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    //Ve třídě Aplikace vytvořte spouštěcí metodu main. V této metodě vytvořte instanci třídy KnihaSluzba.
    public static void main(String[] args) {
        KnihaSluzba knihovna = new KnihaSluzba();
        //knihovna.vypisSeznamVsechKnih();
        //Vypište do konzole (pomocí System.out) celkový počet knížek v naší malé databázi.
        System.out.println(knihovna.listKnih.size());
        //Vypište do konzole názvy všech knížek, které napsal Karel Čapek.
        System.out.println(knihovna.vypisSeznamKnihAutora("Karel Čapek"));
        //Vypište všechny knížky vydané poprvé v roce 1845. Výpis bude ve tvaru jméno autora: název knihy.
        System.out.println(knihovna.vypisKnihyPodleRoku(1845));
    }


    //BONUS
    //TODO Validovat hodnoty předávané do setterů třídy Kniha. Pokud je parametr chybný, je vhodné vyhodit výjimku IllegalArgumentException:
    //TODO Jméno autora by nemělo být prázdné (null ani prázdný String).
    //TODO Název knihy by neměl být prázdný (null ani prázdný String).
    //TODO Budeme uvažovat pouze tištěné knihy, takže rok vydání by neměl být starší, než je vynález knihtisku – použijte jako hraniční rok 1440.
    //TODO Implementujte testy na validace implementované v setterech – tj. zda správné hodnoty projdou a chybné neprojdou (vyhodí výjimku).
}
