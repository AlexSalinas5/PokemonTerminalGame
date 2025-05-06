package Pokemon;

import Elements.ElementType;

public abstract class Pokemon {
  private final String name;
  private int health;
  private int counterToIncreaseAttackDamage = 0;
  protected boolean tellsIfPokemonIsPoisoned = false;
  protected boolean tellsIfPokemonIsInvincible = false;

  public OMPoison omPoison;
  public OMInvincible omInvincible;
  public AttackInfo1 attackInfo1;
  public AttackInfo2 attackInfo2;

  public abstract ElementType getElementType();

  public Pokemon(String name, int health) {
    this.name = name;
    this.health = health;
  }

  public String getName() {
    return this.name;
  }

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int newHealth) {
    this.health = newHealth;
  }

  public int getCounterToIncreaseAttackDamage() {
    return this.counterToIncreaseAttackDamage;
  }

  public void setCounterToIncreaseAttackDamage(int counterToIncreaseAttackDamage) {
    this.counterToIncreaseAttackDamage = counterToIncreaseAttackDamage;
  }

  public void setHealthIfPokemonDamagesItsSelf(int currentHealth, int damageToSelf) {
    setHealth((currentHealth - damageToSelf));
  }

  public void setHealthIfPokemonHealsItsSelf(int currentHealth, int healthToSelf) {
    setHealth((currentHealth + healthToSelf));
  }

  public int gotHit(int damage) {
    return getHealth() - damage;
  }

  /**
   * DELETE METHOD WHEN DONE WITH PROJECT
   *
   * <p>
   *
   * <p>THIS WILL TELL YOU INFO ABOUT THE POKEMON LIKE ATTACK
   */
  public abstract String DevInfo();

  public abstract String getAttackAndDamageInfo();
}
