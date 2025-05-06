package Pokemon.Water;

import Elements.ElementType;
import Elements.Water.WaterType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Squirtle extends Pokemon implements AttackInfo1 {
  private final ElementType elementType = new WaterType();

  public Squirtle() {
    super("Squirtle", 50);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Shell Attack";
  }

  @Override
  public String getAttackDescription1() {
    return "Squirtle strikes with its hard shell, delivering a strong and steady hit.";
  }

  @Override
  public int getAttackDamage1() {
    return 20;
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
