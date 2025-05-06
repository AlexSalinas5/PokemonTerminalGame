package Pokemon.Electricity;

import Elements.Electric.ElectricType;
import Elements.ElementType;
import Pokemon.Pokemon;
import Pokemon.AttackInfo1;
import Pokemon.AttackInfo2;

import java.util.Random;

public class Pikachu extends Pokemon implements AttackInfo1, AttackInfo2 {
  private final ElementType elementType = new ElectricType();

  public Pikachu() {
    super("Pikachu", 40);
  }

  @Override
  public ElementType getElementType() {
    return this.elementType;
  }

  @Override
  public String getAttackName1() {
    return "Gnaw";
  }

  @Override
  public String getAttackDescription1() {
    return "Pikachu uses its sharp teeth to bite down on its target, delivering a quick and painful strike.";
  }

  @Override
  public int getAttackDamage1() {
    return 10;
  }

  @Override
  public int getAttackResult1(ElementType elementTypeOfOpponentPokemon) {
    return getAttackDamage1()
        + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
  }

  @Override
  public String getAttackName2() {
    return "Thunder Jolt";
  }

  @Override
  public String getAttackDescription2() {
    return "Flip a coin. If tails, Pikachu does 10 damage to itself.";
  }

  @Override
  public int getAttackDamage2() {
    return 30;
  }

  @Override
  public int getAttackResult2(ElementType elementTypeOfOpponentPokemon) {
    Random random = new Random();
    int a = random.nextInt(2);

    if (a == 0) {
      this.setHealthIfPokemonDamagesItsSelf(getHealth(), 10);
      return getAttackDamage2()
          + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
    } else {
      return getAttackDamage2()
          + this.elementType.tellerOfBonusAttackDamage(elementTypeOfOpponentPokemon);
    }
  }

  @Override
  public String DevInfo() {
    return "Pikachu has 2 attacks";
  }

  @Override
  public String getAttackAndDamageInfo() {
    return "";
  }
}
