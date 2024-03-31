package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {
//TODO Napište testy pro metody.
//TODO Nezapomeňte otestovat i okrajové případy – metoda pro výběr knih dle autora nebo orku nevrátí žádnou knížku nebo vrátí více knih.

    @Test
    void testujeVypisSeznamVsechKnih() {
        //kontroluje, že seznam knih má správný počet položek
        KnihaSluzba knihovna = new KnihaSluzba();
    }

    @Test
    void vypisSeznamKnihAutora() {
    }

    @Test
    void vypisNazevKnihyPodleRoku() {
    }

    @Test
    void filtrovaniKnihPodleRoku() {
    }

    @Test
    void vypisKnihyPodleRoku() {
    }
}