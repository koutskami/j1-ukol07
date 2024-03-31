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
        assertEquals(0, knihovna.vypisSeznamKnihAutora("Alois Nováček").size());
    }

    @Test
    void filtrovaniKnihPodleRoku() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertEquals(2, knihovna.filtrovaniKnihPodleRoku(1856).size());
        assertEquals(0, knihovna.filtrovaniKnihPodleRoku(2030).size());
    }

    @Test
    void vypisKnihyPodleRoku() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertEquals("Karel Čapek", knihovna.filtrovaniKnihPodleRoku(1935).getFirst().getAutor());
        assertEquals("Povídejme si, děti", knihovna.filtrovaniKnihPodleRoku(1954).getFirst().getNazev());
    }
}