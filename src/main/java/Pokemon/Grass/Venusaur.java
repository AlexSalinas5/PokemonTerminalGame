package Pokemon.Grass;

import Elements.ElementType;
import Elements.Grass.GrassType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Venusaur extends Pokemon implements AttackInfo1 {
  private final ElementType elementType = new GrassType();

  public Venusaur() {
    super("Venusaur", 100);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Solarbeam";
  }

  @Override
  public String getAttackDescription1() {
    return "Venusaur absorbs sunlight and unleashes a powerful beam of solar energy, scorching its target with intense force.";
  }

  @Override
  public int getAttackDamage1() {
    return 60;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
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
