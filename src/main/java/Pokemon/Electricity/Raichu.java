package Pokemon.Electricity;

import Elements.Electric.ElectricType;
import Elements.ElementType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;
import Pokemon.AttackInfo2;
import java.util.Random;
import Pokemon.OMInvincible;

public class Raichu extends Pokemon implements AttackInfo1, AttackInfo2, OMInvincible {
  private ElementType elementType = new ElectricType();

  public Raichu() {
    super("Raichu", 80);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Agility";
  }

  @Override
  public String getAttackDescription1() {
    return "Flip a coin. If heads, prevents all damage done to Raichu during opponent's next turn.";
  }

  @Override
  public int getAttackDamage1() {
    return 20;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    Random random = new Random();
    int a = random.nextInt(2);

    if (a == 1) {
      setTellsIfPokemonIsInvincible(true);
    } else {
      System.out.println("Unfortunately, you rolled heads, so you do not become invincible!");
    }

    return getAttackDamage1()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
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
    return "Thunder";
  }

  @Override
  public String getAttackDescription2() {
    return "Flip a coin. If tails, Raichu does 30 damage to itself.";
  }

  @Override
  public int getAttackDamage2() {
    return 60;
  }

  @Override
  public int getAttackResult2(ElementType elementTypeOfOpponentPokemon) {
    Random random = new Random();
    int a = random.nextInt(2);

    if (a == 0) {
      this.setHealthIfPokemonDamagesItsSelf(getHealth(), 30);
      return getAttackDamage2()
          + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
    } else {
      return getAttackDamage2()
          + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
    }
  }

  @Override
  public String DevInfo() {
    return "Raichu has 2 attacks NOTE: Has OMInvincible";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
