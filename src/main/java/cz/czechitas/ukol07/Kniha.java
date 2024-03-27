package cz.czechitas.ukol07;

public class Kniha {
    //autor string, nazev string, rokVydani int - struktura podle jsonu
    private String autorKnihy;
    private String nazevKnihy;
    private Integer rokVydaniKnihy;

    //getter a setter pro autora knihy
    public String getAutorKnihy() {
        return autorKnihy;
    }
    public void setAutorKnihy(String autorKnihy) {
        this.autorKnihy = autorKnihy;
    }

    //getter a setter pro nazev knihy
    public String getNazevKnihy() {
        return nazevKnihy;
    }
    public void setNazevKnihy(String nazevKnihy) {
        this.nazevKnihy = nazevKnihy;
    }

    //getter a setter pro rok vydani knihy
    public Integer getRokVydaniKnihy() {
        return rokVydaniKnihy;
    }
    public void setRokVydaniKnihy(Integer rokVydaniKnihy) {
        this.rokVydaniKnihy = rokVydaniKnihy;
    }
}
