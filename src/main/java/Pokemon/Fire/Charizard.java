package Pokemon.Fire;

import Elements.ElementType;
import Elements.Fire.FireType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Charizard extends Pokemon implements AttackInfo1 {
  ElementType elementType = new FireType();

  public Charizard() {
    super("Charizard", 120);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Fire Spin";
  }

  @Override
  public String getAttackDescription1() {
    return "Charizard engulfs its foe in a swirling vortex of flames, trapping and scorching them with intense heat.";
  }

  @Override
  public int getAttackDamage1() {
    return 100;
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
