public class AttackItem extends Item {

public void useItem(Pokemon p) {
  p.changeAttackStat(this.modifier);
}
}  
