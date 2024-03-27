package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class KnihaSluzba {
    //List<Kniha>
    public List<Kniha> listKnih;

    //InputStream - KnihaSluzba.class.getResourceAsStream("knihy.json"), zavřít s try-with-resources
    //načtení List - objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){})
    private final ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();

    {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")){
            listKnih = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){});
            } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
    //TODO vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih.
    //TODO vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih od zadaného autora (jméno autora bude parametr metody). Vrácený seznam může být prázdný.
    //TODO vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih vydaných v zadaném roce (rok bude parametr metody). Vrácený seznam může být prázdný.
    //TODO Napište testy pro metody. Nezapomeňte otestovat i okrajové případy – metoda pro výběr knih dle autora nebo orku nevrátí žádnou knížku nebo vrátí více knih.

}
