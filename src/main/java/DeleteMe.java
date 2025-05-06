import ASCIIArt.PokemonArt;
import Pokemon.Grass.Bulbasaur;
import Pokemon.Water.Blastoise;
import org.example.Trainer;

public class DeleteMe {

  public static void main(String[] args) {
    Trainer a = new Trainer("Alex");
    a.setCurrentPokemon(new Blastoise());
    System.out.println(a.getCurrentPokemon().getAttackAndDamageInfo());

  }
}
