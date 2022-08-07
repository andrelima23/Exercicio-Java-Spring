package one.digitalinnovation.andrelima23.service;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")

public class PokerService {

    String url = "https://pokeapi.co/api/v2/pokemon/";

    public String getPokemonByID(int id) {
        String pokeID = url+id;
        return pokeID;
    }
    
}
