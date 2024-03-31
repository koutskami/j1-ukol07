package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {
//TODO Napište testy pro metody.
//TODO Nezapomeňte otestovat i okrajové případy – metoda pro výběr knih dle autora nebo orku nevrátí žádnou knížku nebo vrátí více knih.

    @Test
    void vypisSeznamVsechKnih() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertEquals(14, knihovna.listKnih.size()); //nevim jak to udelat obecne
    }

    @Test
    void vypisSeznamKnihAutora() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertEquals(3,knihovna.vypisSeznamKnihAutora("Josef Čapek").size());
    }

    @Test
    void filtrovaniKnihPodleRoku() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertEquals(1, knihovna.filtrovaniKnihPodleRoku(1929).size());
    }

    @Test
    void vypisKnihyPodleRoku() {
        //KnihaSluzba knihovna = new KnihaSluzba();
        //je to void a nevim jak jinak to udelat aby to slo testovat
    }
}