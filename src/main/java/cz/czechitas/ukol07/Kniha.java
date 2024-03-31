package cz.czechitas.ukol07;

public class Kniha {
    //autor string, nazev string, rokVydani int - struktura podle jsonu
    private String autor;
    private String nazev;
    private Integer rokVydani;

    //getter a setter pro autora knihy
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //getter a setter pro nazev knihy
    public String getNazev() {
        return nazev;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    //getter a setter pro rok vydani knihy
    public Integer getRokVydani() {
        return rokVydani;
    }
    public void setRokVydani(Integer rokVydani) {
        this.rokVydani = rokVydani;
    }
}
