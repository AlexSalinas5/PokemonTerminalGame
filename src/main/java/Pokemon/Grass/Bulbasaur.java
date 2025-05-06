package Pokemon.Grass;

import Elements.ElementType;
import Elements.Grass.GrassType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Bulbasaur extends Pokemon implements AttackInfo1 {
  ElementType elementType = new GrassType();

  public Bulbasaur() {
    super("Bulbasaur", 40);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Leech Seed";
  }

  @Override
  public String getAttackDescription1() {
    return "This attack does 20 damage. Heal 10 HP from this Pokemon.";
  }

  @Override
  public int getAttackDamage1() {
    return 20;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    this.setHealthIfPokemonHealsItsSelf(getHealth(), 10);
    return getAttackDamage1()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
  }

  @Override
  public String DevInfo() {
    return "1 attack";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
