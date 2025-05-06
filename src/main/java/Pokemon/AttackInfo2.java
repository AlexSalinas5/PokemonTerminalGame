package Pokemon;

import Elements.ElementType;

public interface AttackInfo2 {

  public abstract String getAttackName2();

  public abstract String getAttackDescription2();

  public abstract int getAttackDamage2();

  public abstract int getAttackResult2(ElementType elementTypeOfOpponentPokemon);
}
