package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {
//Napište testy pro metody.
//Nezapomeňte otestovat i okrajové případy – metoda pro výběr knih dle autora nebo orku nevrátí žádnou knížku nebo vrátí více knih.

    @Test
    void vypisSeznamVsechKnih() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertEquals(14, knihovna.listKnih.size());
    }

    @Test
    void vypisSeznamKnihAutora() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertAll(
                () -> assertEquals(3, knihovna.vypisSeznamKnihAutora("Josef Čapek").size()),
                () -> assertEquals(0, knihovna.vypisSeznamKnihAutora("Alois Nováček").size())
        );
    }

    @Test
    void filtrovaniKnihPodleRoku() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertAll(
                () -> assertEquals(2, knihovna.filtrovaniKnihPodleRoku(1856).size()),
                () -> assertEquals(1, knihovna.filtrovaniKnihPodleRoku(1927).size()),
                () -> assertEquals(0, knihovna.filtrovaniKnihPodleRoku(2030).size())
        );
    }

    @Test
    void vypisKnihyPodleRoku() {
        KnihaSluzba knihovna = new KnihaSluzba();
        assertAll(
                //jeden autor, jeden název
                () -> assertEquals("Karel Čapek", knihovna.filtrovaniKnihPodleRoku(1935).getFirst().getAutor()),
                () -> assertEquals("Povídejme si, děti", knihovna.filtrovaniKnihPodleRoku(1954).getFirst().getNazev()),
                //více autorů, více názvů
                () -> assertEquals("Karel Čapek", knihovna.filtrovaniKnihPodleRoku(1932).getFirst().getAutor()),
                () -> assertEquals("Apokryfy", knihovna.filtrovaniKnihPodleRoku(1932).getFirst().getNazev()),
                () -> assertEquals("Josef Čapek", knihovna.filtrovaniKnihPodleRoku(1932).getLast().getAutor()),
                () -> assertEquals("Devatero pohádek", knihovna.filtrovaniKnihPodleRoku(1932).getLast().getNazev())
        );
    }
}