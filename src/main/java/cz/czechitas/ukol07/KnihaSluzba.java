package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Consumer;


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


    //vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih.
    public void vypisSeznamVsechKnih (){
        //listKnih.forEach(System.out::println); //nevypisuje string
        for (Kniha kniha : listKnih) {
            System.out.println(kniha.getAutor() + " : " + kniha.getNazev() + " (" + kniha.getRokVydani() + ") ");
        }
    }
    //vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih od zadaného autora (jméno autora bude parametr metody). Vrácený seznam může být prázdný.
    public List<String> vypisSeznamKnihAutora (String autor){
        return listKnih.stream()
                .filter(kniha -> kniha.getAutor().equals(autor))
                .map(Kniha::getNazev)
                .toList();
    }
    //vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih vydaných v zadaném roce (rok bude parametr metody). Vrácený seznam může být prázdný.
    public List<String> vypisNazevKnihyPodleRoku (int rokVydani){
        return listKnih.stream()
                .filter(kniha -> kniha.getRokVydani().equals(rokVydani))
                .map(Kniha::getNazev) //zatím vypisuju jen jedno hodnotu
                .toList();
        }

    public List<Kniha> filtrovaniKnihPodleRoku (int rokVydani){
        return listKnih.stream()
                .filter(kniha -> kniha.getRokVydani().equals(rokVydani))
                .toList();
    }

    public void vypisKnihyPodleRoku(int rokVydani){
        for (int i = 0; i < filtrovaniKnihPodleRoku(rokVydani).size(); i++) {
            System.out.println(filtrovaniKnihPodleRoku(rokVydani).get(i).getAutor() + " : " + filtrovaniKnihPodleRoku(rokVydani).get(i).getNazev());
        }
    }
}
