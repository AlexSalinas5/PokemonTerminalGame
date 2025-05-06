import Pokemon.Pokemon;

public class Trainer {
  private String trainerName;
  private Pokemon currentPokemon;

  public Trainer(String trainerName) {
    this.trainerName = trainerName;
  }

  public String getName() {
    return this.trainerName;
  }

  public Pokemon getCurrentPokemon() {
    return this.currentPokemon;
  }

  public void setCurrentPokemon(Pokemon newCreation) {
    this.currentPokemon = newCreation;
  }
}
