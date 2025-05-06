package Pokemon.Fire;

import Elements.ElementType;
import Elements.Fire.FireType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Charmander extends Pokemon implements AttackInfo1 {
  ElementType elementType = new FireType();

  public Charmander() {
    super("Charmander", 50);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Ember";
  }

  @Override
  public String getAttackDescription1() {
    return "Charmander releases small but fierce flames, singeing its opponent with burning embers.";
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
  public String DevInfo() {
    return "1 attack";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
