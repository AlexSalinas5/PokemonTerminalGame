package Pokemon.Water;

import Elements.ElementType;
import Elements.Water.WaterType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;
import Pokemon.AttackInfo2;
import Pokemon.OMInvincible;

public class Wartortle extends Pokemon implements AttackInfo1, AttackInfo2, OMInvincible {
  ElementType elementType = new WaterType();

  public Wartortle() {
    super("Wartortle", 70);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Withdraw";
  }

  @Override
  public String getAttackDescription1() {
    return "Flip a coin. If heads, prevents all damage done to Wartortle during opponent's next turn.";
  }

  @Override
  public int getAttackDamage1() {
    return 0;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    setTellsIfPokemonIsInvincible(true);
    return 0;
  }

  @Override
  public boolean getTellsIfPokemonIsInvincible() {
    return this.tellsIfPokemonIsInvincible;
  }

  @Override
  public boolean setTellsIfPokemonIsInvincible(boolean updater) {
    return this.tellsIfPokemonIsInvincible = updater;
  }

  @Override
  public String getAttackName2() {
    return "Bite";
  }

  @Override
  public String getAttackDescription2() {
    return "Wartortle sinks its sharp fangs into the foe, delivering a fierce and decisive bite.";
  }

  @Override
  public int getAttackDamage2() {
    return 40;
  }

  @Override
  public int getAttackResult2(ElementType elementTypeOfOpponentPokemon) {
    return getAttackDamage2()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
  }

  @Override
  public String DevInfo() {
    return "Wartortle has 2 attacks NOTE: IT HAS OMINVINCIBLE ";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
