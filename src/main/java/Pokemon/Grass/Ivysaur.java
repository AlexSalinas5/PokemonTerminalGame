package Pokemon.Grass;

import Elements.ElementType;
import Elements.Grass.GrassType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;
import Pokemon.AttackInfo2;
import Pokemon.OMPoison;

public class Ivysaur extends Pokemon implements AttackInfo1, AttackInfo2, OMPoison {
  private final ElementType elementType = new GrassType();

  public Ivysaur(String name, int health) {
    super("Ivysaur", 60);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Vine Whip";
  }

  @Override
  public String getAttackDescription1() {
    return "Ivysaur lashes out with its sturdy vines, striking the opponent with swift and precise attacks.";
  }

  @Override
  public int getAttackDamage1() {
    return 30;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    return getAttackDamage1()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
  }

  @Override
  public String getAttackName2() {
    return "Poisonpowder";
  }

  @Override
  public String getAttackDescription2() {
    return "The defending player's pokemons are now poisoned.";
  }

  @Override
  public int getAttackDamage2() {
    return 20;
  }

  @Override
  public int getAttackResult2(ElementType elementTypeOfOpponentPokemon) {
    return getAttackDamage1()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
  }

  @Override
  public boolean getTellsIfPokemonIsPoisoned() {
    return this.tellsIfPokemonIsPoisoned;
  }

  @Override
  public boolean setTellsIfPokemonIsPoisoned() {
    return this.tellsIfPokemonIsPoisoned = true;
  }

  @Override
  public void ifPoisonedChangeHealth() {
    if (this.tellsIfPokemonIsPoisoned) {
      setHealth(getHealth() - 10);
    }
  }

  @Override
  public String DevInfo() {
    return "Contains OMPoison : 2 Attacks";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
