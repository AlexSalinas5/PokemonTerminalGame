package Pokemon.Water;

import Elements.ElementType;
import Elements.Water.WaterType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;

public class Blastoise extends Pokemon implements AttackInfo1 {
  private final ElementType elementType = new WaterType();
  int attackDamage = 40;

  public Blastoise() {
    super("Blastoise", 100);
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "Your pokemon: " + getName() + "\nAttack: Hydro Pump\nDamage: " + this.attackDamage + "\nAttack Description: " + getAttackDescription1() + "\n";
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Hydro Pump";
  }

  @Override
  public String getAttackDescription1() {
    return "After each attack use, attack damage increases by 10.";
  }

  @Override
  public int getAttackDamage1() {
    return this.attackDamage;
  }

  public void increaseAttackBy10() {
    if (this.getCounterToIncreaseAttackDamage() == 0) {
      return;
    } else {
      this.attackDamage+=10;
    }
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    if (this.getCounterToIncreaseAttackDamage() == 0) {
      increaseAttackBy10();
      setCounterToIncreaseAttackDamage(1);
      return getAttackDamage1()
          + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
    } else {
      increaseAttackBy10();
      int pointer = this.getCounterToIncreaseAttackDamage();
      this.setCounterToIncreaseAttackDamage(pointer++);
      return 40
          + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon)
          + (this.getCounterToIncreaseAttackDamage() * 10);
    }
  }

  @Override
  public String DevInfo() {
    return "1 attack NOTE: Attack increases in damage after each use";
  }
}
