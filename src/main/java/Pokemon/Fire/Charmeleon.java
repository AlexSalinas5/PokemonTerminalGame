package Pokemon.Fire;

import Elements.ElementType;
import Elements.Fire.FireType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Charmeleon extends Pokemon implements AttackInfo1 {
  ElementType elementType = new FireType();

  public Charmeleon() {
    super("Charmeleon", 80);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Flamethrower";
  }

  @Override
  public String getAttackDescription1() {
    return "Charmeleon unleashes a stream of scorching flames, burning its target with intense heat.";
  }

  @Override
  public int getAttackDamage1() {
    return 50;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    return getAttackDamage1()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
  }

  @Override
  public String DevInfo() {
    return "1 Attack";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
