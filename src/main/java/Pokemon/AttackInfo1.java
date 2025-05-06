package Pokemon;

import Elements.ElementType;

public interface AttackInfo1 {

  public abstract String getAttackName1();

  public abstract String getAttackDescription1();

  public abstract int getAttackDamage1();

  public abstract int getAttackResult1(ElementType elementTypeOfOpponentPokemon);
}
